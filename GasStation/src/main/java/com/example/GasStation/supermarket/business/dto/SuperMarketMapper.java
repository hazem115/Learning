package com.example.GasStation.supermarket.business.dto;

import com.example.GasStation.supermarket.business.dto.request.SuperMarketRequestDto;
import com.example.GasStation.supermarket.business.dto.response.SuperMarketResponseDto;
import com.example.GasStation.supermarket.presistance.entity.SuperMarket;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
@Mapper(componentModel = "spring",
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS,
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface SuperMarketMapper {
    SuperMarketResponseDto entityToDto(SuperMarket superMarket);
    Set<SuperMarketResponseDto> entityToDto(Set<SuperMarket> superMarket);
    SuperMarket dtoToEntity(SuperMarketRequestDto request);
    Set<SuperMarket> dtoToEntity(Set<SuperMarketRequestDto> request);
}
