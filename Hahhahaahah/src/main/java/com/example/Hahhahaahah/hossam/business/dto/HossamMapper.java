package com.example.Hahhahaahah.hossam.business.dto;

import com.example.Hahhahaahah.hossam.business.dto.request.HossamRequestDto;
import com.example.Hahhahaahah.hossam.business.dto.response.HossamResponseDto;
import com.example.Hahhahaahah.hossam.presistance.entity.Hossam;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
@Mapper(componentModel = "spring",
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS,
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface HossamMapper {
    HossamResponseDto entityToDto(Hossam hossam);
    Set<HossamResponseDto> entityToDto(Set<Hossam> hossam);
    Hossam dtoToEntity(HossamRequestDto hossamRequestDto);
    Set<Hossam> dtoToEntity(Set<HossamRequestDto> hossamRequestDto);
}
