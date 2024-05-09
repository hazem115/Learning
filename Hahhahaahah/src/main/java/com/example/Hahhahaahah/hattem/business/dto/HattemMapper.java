package com.example.Hahhahaahah.hattem.business.dto;

import com.example.Hahhahaahah.hattem.business.dto.request.HattemRequestDto;
import com.example.Hahhahaahah.hattem.business.dto.response.HattemResponseDto;
import com.example.Hahhahaahah.hattem.presistance.entity.Hattem;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.springframework.stereotype.Component;

import java.util.Optional;
import java.util.Set;

@Component
@Mapper(componentModel = "spring",
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS,
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface HattemMapper {
    HattemResponseDto entityToDto(Hattem hattem);
    Set<HattemResponseDto> entityToDto(Set<Hattem> hattem);
    Hattem dtoToEntity(HattemRequestDto hattemRequestDto);
    Set<Hattem> dtoToEntity(Set<HattemRequestDto> hattemRequestDto);
}
