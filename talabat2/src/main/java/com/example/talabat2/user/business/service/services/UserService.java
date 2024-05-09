package com.example.talabat2.user.business.service.services;

import com.example.talabat2.user.business.dto.request.UserRequestDto;
import com.example.talabat2.user.business.dto.response.UserResponseDto;

import java.util.Set;

public interface UserService {
    Set<UserResponseDto> getAllUsers();

    UserResponseDto saveUser(UserRequestDto request);

    UserResponseDto getByRefNo(String refNo);

    void deleteById(Long id);

    UserResponseDto getById(Long id);
    UserResponseDto updateUser(String refNo, UserRequestDto request);
}
