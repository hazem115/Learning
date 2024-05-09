package com.example.GasStation.carserviceTransaction.business.service.services;

import com.example.GasStation.carserviceTransaction.business.dto.request.CarServiceTransactionRequestDto;
import com.example.GasStation.carserviceTransaction.business.dto.response.CarServiceTransactionResponseDto;

import java.util.Set;

public interface CarServiceTransactionService {
    CarServiceTransactionResponseDto create(CarServiceTransactionRequestDto request);
    CarServiceTransactionResponseDto update(String refNo,CarServiceTransactionRequestDto request);
    void deleteById(Long id);
    CarServiceTransactionResponseDto findById(Long id);
    Set<CarServiceTransactionResponseDto> findAll();
    CarServiceTransactionResponseDto findByRefNo(String refNo);

}
