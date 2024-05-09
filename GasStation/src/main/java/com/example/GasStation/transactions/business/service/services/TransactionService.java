package com.example.GasStation.transactions.business.service.services;

import com.example.GasStation.transactions.business.dto.request.TransactionRequestDto;
import com.example.GasStation.transactions.business.dto.response.TransactionResponseDto;

import java.util.Set;

public interface TransactionService {
    TransactionResponseDto create(TransactionRequestDto request);
    TransactionResponseDto update(String refNo, TransactionRequestDto request);
    void deleteById(Long id);
    TransactionResponseDto findById(Long id);
    Set<TransactionResponseDto> findAll();
    TransactionResponseDto findByRefNo(String refNo);
}
