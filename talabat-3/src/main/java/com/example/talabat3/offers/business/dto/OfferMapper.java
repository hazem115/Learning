package com.example.talabat3.offers.business.dto;

import com.example.talabat3.offers.business.dto.request.OfferRequestDto;
import com.example.talabat3.offers.business.dto.response.OfferResponseDto;
import com.example.talabat3.offers.presistance.entity.Offer;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
@Mapper(componentModel = "spring",
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS,
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface OfferMapper {
    OfferResponseDto entityToDto(Offer offer);
    Set<OfferResponseDto> entityToDto(Set<Offer> offer);
    Offer dtoToEntity(OfferRequestDto request);
    Set<Offer> dtoToEntity(Set<OfferRequestDto> request);
}
