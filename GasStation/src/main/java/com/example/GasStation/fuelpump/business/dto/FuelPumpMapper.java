package com.example.GasStation.fuelpump.business.dto;

import com.example.GasStation.fuelpump.business.dto.request.FuelPumpRequestDto;
import com.example.GasStation.fuelpump.business.dto.response.FuelPumpResponseDto;
import com.example.GasStation.fuelpump.presistance.entity.FuelPump;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
@Mapper(componentModel = "spring",
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS,
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface FuelPumpMapper {
    FuelPumpResponseDto entityToDto(FuelPump fuelPump);
    Set<FuelPumpResponseDto> entityToDto(Set<FuelPump> fuelPump);
    FuelPump dtoToEntity(FuelPumpRequestDto request);
    Set<FuelPump> dtoToEntity(Set<FuelPumpRequestDto> request);
}
