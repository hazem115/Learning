package com.example.GasStation.carservice.business.dto;

import com.example.GasStation.carservice.business.dto.request.CarServiceRequestDto;
import com.example.GasStation.carservice.business.dto.response.CarServiceResponseDto;
import com.example.GasStation.carservice.presistance.entity.CarService;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
@Mapper(componentModel = "spring",
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS,
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface CarServiceMapper {
    CarServiceResponseDto entityToDto(CarService carService);
    Set<CarServiceResponseDto> entityToDto(Set<CarService> carService);
    CarService dtoToEntity(CarServiceRequestDto request);
    Set<CarService> dtoToEntity(Set<CarServiceRequestDto> request);

}
