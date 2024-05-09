package com.example.GasStation.transactions.business.dto;

import com.example.GasStation.transactions.business.dto.request.TransactionRequestDto;
import com.example.GasStation.transactions.business.dto.response.TransactionResponseDto;
import com.example.GasStation.transactions.presistance.entity.Transaction;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
@Mapper(componentModel = "spring",
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS,
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface TransactionMapper {
    TransactionResponseDto entityToDto(Transaction transaction);
    Set<TransactionResponseDto> entityToDto(Set<Transaction> transaction);
    Transaction dtoToEntity(TransactionRequestDto request);
    Set<Transaction> dtoToEntity(Set<TransactionRequestDto> request);
}
