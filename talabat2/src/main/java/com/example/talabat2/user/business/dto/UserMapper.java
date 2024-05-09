package com.example.talabat2.user.business.dto;

import com.example.talabat2.user.business.dto.request.UserRequestDto;
import com.example.talabat2.user.business.dto.response.UserResponseDto;
import com.example.talabat2.user.presistance.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
@Mapper(componentModel = "spring",
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS,
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface UserMapper {

    UserResponseDto entityToDto(User user);
    Set<UserResponseDto> entityToDto(Set<User> user);
    User dtoToEntity(UserRequestDto request);
    Set<User> dtoToEntity(Set<UserRequestDto> request);

}
