package com.example.GasStation.supermarketTransaction.business.dto;

import com.example.GasStation.supermarketTransaction.business.dto.request.SuperMarketTransactionRequestDto;
import com.example.GasStation.supermarketTransaction.business.dto.response.SuperMarketTransactionResponseDto;
import com.example.GasStation.supermarketTransaction.presistance.entity.SuperMarketTransaction;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
@Mapper(componentModel = "spring",
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS,
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface SuperMarketTransactionMapper {
    SuperMarketTransactionResponseDto entityToDto(SuperMarketTransaction transaction);
    Set<SuperMarketTransactionResponseDto> entityToDto(Set<SuperMarketTransaction> transaction);
    SuperMarketTransaction dtoToEntity(SuperMarketTransactionRequestDto request);
    Set<SuperMarketTransaction> dtoToEntity(Set<SuperMarketTransactionRequestDto> request);
}
