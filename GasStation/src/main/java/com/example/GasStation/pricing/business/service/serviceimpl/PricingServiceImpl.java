package com.example.GasStation.pricing.business.service.serviceimpl;

import com.example.GasStation.pricing.business.dto.PricingMapper;
import com.example.GasStation.pricing.business.dto.request.PricingRequestDto;
import com.example.GasStation.pricing.business.dto.response.PricingResponseDto;
import com.example.GasStation.pricing.business.service.services.PricingService;
import com.example.GasStation.pricing.presistance.entity.Pricing;
import com.example.GasStation.pricing.presistance.repo.PricingRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class PricingServiceImpl implements PricingService {
    private final PricingMapper pricingMapper;
    private final PricingRepo pricingRepo;
    @Override
    public PricingResponseDto create(PricingRequestDto request) {
        Pricing pricing = pricingRepo.save(pricingMapper.dtoToEntity(request));
        return pricingMapper.entityToDto(pricing);
    }

    @Override
    public PricingResponseDto update(String refNo, PricingRequestDto request) {
        Pricing oldPricing = pricingRepo.findByRefNo(refNo);
        Pricing pricingToUpdate = pricingMapper.dtoToEntity(request);
        pricingToUpdate.setId(oldPricing.getId());
        return pricingMapper.entityToDto(pricingRepo.save(pricingToUpdate));
    }

    @Override
    public void deleteById(Long id) {
        pricingRepo.deleteById(id);
    }

    @Override
    public PricingResponseDto findById(Long id) {
        Pricing pricing = pricingRepo.findById(id).orElse(null);
        return pricingMapper.entityToDto(pricing);
    }

    @Override
    public Set<PricingResponseDto> findAll() {
        List<Pricing> pricingList = pricingRepo.findAll();
        return pricingMapper.entityToDto(new HashSet<>(pricingList));
    }

    @Override
    public PricingResponseDto findByRefNo(String refNo) {
        Pricing response = pricingRepo.findByRefNo(refNo);
        return pricingMapper.entityToDto(response);
    }
}
