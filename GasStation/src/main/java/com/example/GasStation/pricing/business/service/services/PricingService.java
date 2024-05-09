package com.example.GasStation.pricing.business.service.services;

import com.example.GasStation.pricing.business.dto.request.PricingRequestDto;
import com.example.GasStation.pricing.business.dto.response.PricingResponseDto;

import java.util.Set;

public interface PricingService {
    PricingResponseDto create(PricingRequestDto request);
    PricingResponseDto update(String refNo, PricingRequestDto request);
    void deleteById(Long id);
    PricingResponseDto findById(Long id);
    Set<PricingResponseDto> findAll();
    PricingResponseDto findByRefNo(String refNo);
}
