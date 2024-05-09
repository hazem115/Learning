package com.example.GasStation.carserviceTransaction.business.dto;

import com.example.GasStation.carserviceTransaction.business.dto.request.CarServiceTransactionRequestDto;
import com.example.GasStation.carserviceTransaction.business.dto.response.CarServiceTransactionResponseDto;
import com.example.GasStation.carserviceTransaction.presistance.entity.CarServiceTransaction;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
@Mapper(componentModel = "spring",
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS,
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface CarServiceTransactionMapper {
    CarServiceTransactionResponseDto entityToDto(CarServiceTransaction carServiceTransaction);
    Set<CarServiceTransactionResponseDto> entityToDto(Set<CarServiceTransaction> carServiceTransaction);
    CarServiceTransaction dtoToEntity(CarServiceTransactionRequestDto requestDto);
    Set<CarServiceTransaction> dtoToEntity(Set<CarServiceTransactionRequestDto> requestDto);
}
