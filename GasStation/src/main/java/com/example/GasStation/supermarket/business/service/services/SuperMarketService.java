package com.example.GasStation.supermarket.business.service.services;

import com.example.GasStation.supermarket.business.dto.SuperMarketMapper;
import com.example.GasStation.supermarket.business.dto.request.SuperMarketRequestDto;
import com.example.GasStation.supermarket.business.dto.response.SuperMarketResponseDto;

import java.util.Set;

public interface SuperMarketService {
    SuperMarketResponseDto create(SuperMarketRequestDto request);
    SuperMarketResponseDto update(String refNo, SuperMarketRequestDto request);
    void deleteById(Long id);
    SuperMarketResponseDto findById(Long id);
    Set<SuperMarketResponseDto> findAll();
    SuperMarketResponseDto findByRefNo(String refNo);

}
