package com.example.Hahhahaahah.hazem.business.service.services;

import com.example.Hahhahaahah.hazem.business.dto.request.HazemRequestDto;
import com.example.Hahhahaahah.hazem.business.dto.response.HazemResponseDto;

import java.util.Set;

public interface HazemService {
    HazemResponseDto create(HazemRequestDto hazemRequestDto);

    HazemResponseDto update(String refNo, HazemRequestDto hazemRequestDto);

    void delete(Long id);

    HazemResponseDto getById(Long id);

    Set<HazemResponseDto> getAll();

    HazemResponseDto getByRefNo(String refNo);
    HazemResponseDto getByName(String name);
    HazemResponseDto getByIdAndName(Long id, String name);
    HazemResponseDto getByPhone(String phone);
}
