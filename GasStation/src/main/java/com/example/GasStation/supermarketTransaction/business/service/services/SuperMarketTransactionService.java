package com.example.GasStation.supermarketTransaction.business.service.services;

import com.example.GasStation.supermarketTransaction.business.dto.request.SuperMarketTransactionRequestDto;
import com.example.GasStation.supermarketTransaction.business.dto.response.SuperMarketTransactionResponseDto;

import java.util.Set;

public interface SuperMarketTransactionService {
    SuperMarketTransactionResponseDto create(SuperMarketTransactionRequestDto request);
    SuperMarketTransactionResponseDto update(String refNo, SuperMarketTransactionRequestDto request);
    void deleteById(Long id);
    SuperMarketTransactionResponseDto findById(Long id);
    Set<SuperMarketTransactionResponseDto> findAll();
    SuperMarketTransactionResponseDto findByRefNo(String refNo);
}
