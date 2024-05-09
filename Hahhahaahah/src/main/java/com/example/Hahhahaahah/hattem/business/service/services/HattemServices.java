package com.example.Hahhahaahah.hattem.business.service.services;


import com.example.Hahhahaahah.hattem.business.dto.request.HattemRequestDto;
import com.example.Hahhahaahah.hattem.business.dto.response.HattemResponseDto;

import java.util.Optional;
import java.util.Set;

public interface HattemServices {
    HattemResponseDto create(HattemRequestDto hattemRequestDto);

    HattemResponseDto update(String refNo, HattemRequestDto hattemRequestDto);

    void deleteById(Long id);

    HattemResponseDto findByRefNo(String refNo);

    Set<HattemResponseDto> getAll();

    HattemResponseDto getById(Long id);
}
