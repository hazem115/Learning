package com.example.talabat2.userorders.business.dto;

import com.example.talabat2.userorders.business.dto.request.UserOrderRequestDto;
import com.example.talabat2.userorders.business.dto.response.UserOrderResponseDto;
import com.example.talabat2.userorders.presistance.entity.UserOrder;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
@Mapper(componentModel = "spring",
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS,
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface UserOrderMapper {

    UserOrderResponseDto entityToDto(UserOrder userOrder);

    Set<UserOrderResponseDto> entityToDto(Set<UserOrder> userOrder);

    UserOrder dtoToEntity(UserOrderRequestDto request);

    Set<UserOrder> dtoToEntity(Set<UserOrderRequestDto> request);

}
