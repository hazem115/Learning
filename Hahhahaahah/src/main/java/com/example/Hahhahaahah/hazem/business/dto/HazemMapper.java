package com.example.Hahhahaahah.hazem.business.dto;

import com.example.Hahhahaahah.hazem.business.dto.request.HazemRequestDto;
import com.example.Hahhahaahah.hazem.business.dto.response.HazemResponseDto;
import com.example.Hahhahaahah.hazem.presistance.entity.Hazem;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
@Mapper(componentModel = "spring",
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS,
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface HazemMapper {
    HazemResponseDto entityToDto(Hazem hazem);
    Set<HazemResponseDto> entityToDto(Set<Hazem> hazem);
    Hazem dtoToEntity(HazemRequestDto hazemRequestDto);
    Set<Hazem> dtoToEntity(Set<HazemRequestDto> hazemRequestDto);
}
