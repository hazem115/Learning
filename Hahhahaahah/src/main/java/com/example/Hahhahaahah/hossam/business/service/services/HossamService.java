package com.example.Hahhahaahah.hossam.business.service.services;

import com.example.Hahhahaahah.hossam.business.dto.request.HossamRequestDto;
import com.example.Hahhahaahah.hossam.business.dto.response.HossamResponseDto;

import java.util.Set;

public interface HossamService {

    HossamResponseDto create(HossamRequestDto hossamRequestDto);
    HossamResponseDto update(String refNo, HossamRequestDto hossamRequestDto);
    void delete(Long id);
    HossamResponseDto getById(Long id);
    Set<HossamResponseDto> getAll();
    HossamResponseDto getByRefNo(String refNo);
}
