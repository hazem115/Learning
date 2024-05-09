package com.example.Hahhahaahah.yossef.business.dto;

import com.example.Hahhahaahah.yossef.business.dto.request.YossefRequestDto;
import com.example.Hahhahaahah.yossef.business.dto.response.YossefResponseDto;
import com.example.Hahhahaahah.yossef.presistance.entity.Yossef;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
@Mapper(componentModel = "spring",
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS,
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface YossefMapper {

    YossefResponseDto entityToDto(Yossef yossef);
    Set<YossefResponseDto> entityToDto(Set<Yossef> yossef);
    Yossef dtoToEntity(YossefRequestDto yossefRequestDto);
    Set<Yossef> dtoToEntity(Set<YossefRequestDto> yossefRequestDto);
}
