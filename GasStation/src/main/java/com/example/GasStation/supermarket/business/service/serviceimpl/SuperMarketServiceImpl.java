package com.example.GasStation.supermarket.business.service.serviceimpl;

import com.example.GasStation.supermarket.business.dto.SuperMarketMapper;
import com.example.GasStation.supermarket.business.dto.request.SuperMarketRequestDto;
import com.example.GasStation.supermarket.business.dto.response.SuperMarketResponseDto;
import com.example.GasStation.supermarket.business.service.services.SuperMarketService;
import com.example.GasStation.supermarket.presistance.entity.SuperMarket;
import com.example.GasStation.supermarket.presistance.repo.SuperMarketRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class SuperMarketServiceImpl implements SuperMarketService {
    private final SuperMarketMapper superMarketMapper;
    private final SuperMarketRepo superMarketRepo;
    @Override
    public SuperMarketResponseDto create(SuperMarketRequestDto request) {
        SuperMarket superMarket = superMarketRepo.save(superMarketMapper.dtoToEntity(request));
        return superMarketMapper.entityToDto(superMarket);
    }

    @Override
    public SuperMarketResponseDto update(String refNo, SuperMarketRequestDto request) {
        SuperMarket oldSuperMarket = superMarketRepo.findByRefNo(refNo);
        SuperMarket newSuperMarket = superMarketMapper.dtoToEntity(request);
        newSuperMarket.setId(oldSuperMarket.getId());
        return superMarketMapper.entityToDto(superMarketRepo.save(newSuperMarket));
    }

    @Override
    public void deleteById(Long id) {
        superMarketRepo.deleteById(id);
    }

    @Override
    public SuperMarketResponseDto findById(Long id) {
        SuperMarket superMarket = superMarketRepo.findById(id).orElse(null);
        return superMarketMapper.entityToDto(superMarket);
    }

    @Override
    public Set<SuperMarketResponseDto> findAll() {
        List<SuperMarket> superMarketList = superMarketRepo.findAll();
        return superMarketMapper.entityToDto(new HashSet<>(superMarketList));
    }

    @Override
    public SuperMarketResponseDto findByRefNo(String refNo) {
        SuperMarket superMarket = superMarketRepo.findByRefNo(refNo);
        return superMarketMapper.entityToDto(superMarket);
    }
}