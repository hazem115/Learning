package com.example.talabat.user.business.dto;

import com.example.talabat.user.business.dto.request.UserDtoRequest;
import com.example.talabat.user.business.dto.response.UserDtoResponse;
import com.example.talabat.user.presistance.entity.User;
import org.mapstruct.*;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
@Mapper(componentModel = "spring",
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS,
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface UserMapper {

    UserDtoResponse entityToDto(User user);
    Set<UserDtoResponse> entityToDto(Set<User> user);
    User dtoToEntity(UserDtoRequest request);
    Set<User> dtoToEntity(Set<UserDtoRequest> request);

}
