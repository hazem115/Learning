package com.example.GasStation.fuelpump.business.service.services;

import com.example.GasStation.fuelpump.business.dto.request.FuelPumpRequestDto;
import com.example.GasStation.fuelpump.business.dto.response.FuelPumpResponseDto;

import java.util.Set;

public interface FuelPumpService {
    FuelPumpResponseDto create(FuelPumpRequestDto request);
    FuelPumpResponseDto update(String refNo, FuelPumpRequestDto request);
    void deleteById(Long id);
    FuelPumpResponseDto findById(Long id);
    Set<FuelPumpResponseDto> findAll();
    FuelPumpResponseDto findByRefNo(String refNo);
}
