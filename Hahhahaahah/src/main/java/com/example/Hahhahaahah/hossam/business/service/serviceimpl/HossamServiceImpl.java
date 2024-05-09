package com.example.Hahhahaahah.hossam.business.service.serviceimpl;

import com.example.Hahhahaahah.hossam.business.dto.HossamMapper;
import com.example.Hahhahaahah.hossam.business.dto.request.HossamRequestDto;
import com.example.Hahhahaahah.hossam.business.dto.response.HossamResponseDto;
import com.example.Hahhahaahah.hossam.business.service.services.HossamService;
import com.example.Hahhahaahah.hossam.presistance.entity.Hossam;
import com.example.Hahhahaahah.hossam.presistance.repo.HossamRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class HossamServiceImpl implements HossamService {

    private final HossamMapper hossamMapper;
    private final HossamRepo hossamRepo;

    @Override
    public HossamResponseDto create(HossamRequestDto hossamRequestDto) {
        Hossam hossam = hossamRepo.save(hossamMapper.dtoToEntity(hossamRequestDto));
        return hossamMapper.entityToDto(hossam);
    }

    @Override
    public HossamResponseDto update(String refNo, HossamRequestDto hossamRequestDto) {
        Hossam oldHossam = hossamRepo.getByRefNo(refNo);
        Hossam newHossam = hossamMapper.dtoToEntity(hossamRequestDto);
        oldHossam.setId(newHossam.getId());
        return hossamMapper.entityToDto(hossamRepo.save(newHossam));
    }

    @Override
    public void delete(Long id) {
        hossamRepo.deleteById(id);
    }

    @Override
    public HossamResponseDto getById(Long id) {
        Hossam hossam = hossamRepo.findById(id).orElse(null);
        return hossamMapper.entityToDto(hossam);
    }

    @Override
    public Set<HossamResponseDto> getAll() {
        List<Hossam> hossam = hossamRepo.findAll();
        return hossamMapper.entityToDto(new HashSet<>(hossam));
    }

    @Override
    public HossamResponseDto getByRefNo(String refNo) {
        Hossam hossam = hossamRepo.getByRefNo(refNo);
        return hossamMapper.entityToDto(hossam);
    }
}
