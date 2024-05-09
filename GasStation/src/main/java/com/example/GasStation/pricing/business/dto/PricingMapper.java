package com.example.GasStation.pricing.business.dto;

import com.example.GasStation.pricing.business.dto.request.PricingRequestDto;
import com.example.GasStation.pricing.business.dto.response.PricingResponseDto;
import com.example.GasStation.pricing.presistance.entity.Pricing;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
@Mapper(componentModel = "spring",
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS,
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface PricingMapper {
    PricingResponseDto entityToDto(Pricing pricing);
    Set<PricingResponseDto> entityToDto(Set<Pricing> pricing);
    Pricing dtoToEntity(PricingRequestDto request);
    Set<Pricing> dtoToEntity(Set<PricingRequestDto> request);
}
