package com.example.Hahhahaahah.yossef.business.service.services;

import com.example.Hahhahaahah.yossef.business.dto.request.YossefRequestDto;
import com.example.Hahhahaahah.yossef.business.dto.response.YossefResponseDto;

import java.util.Set;

public interface YossefService {

    YossefResponseDto create(YossefRequestDto yossefRequestDto);
    YossefResponseDto update(String refNo, YossefRequestDto yossefRequestDto);
    void delete(Long id);
    YossefResponseDto getById(Long id);
    Set<YossefResponseDto> getAll();
    YossefResponseDto getByRefNo(String refNo);
}
