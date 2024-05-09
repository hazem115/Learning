package com.example.GasStation.carservice.business.service.services;

import com.example.GasStation.carservice.business.dto.request.CarServiceRequestDto;
import com.example.GasStation.carservice.business.dto.response.CarServiceResponseDto;

import java.util.Set;

public interface CarServiceServices {

    CarServiceResponseDto createCarService(CarServiceRequestDto request);
    CarServiceResponseDto update(String refNo, CarServiceRequestDto request);
    void deleteById(Long id);
    CarServiceResponseDto findByRefNo(String refNo);
    CarServiceResponseDto getCarServiceById(Long id);
    Set<CarServiceResponseDto> getAllCarServices();


}
