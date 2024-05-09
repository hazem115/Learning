package com.example.talabat3.user.business.service.services;

import com.example.talabat3.user.business.dto.request.UserRequestDto;
import com.example.talabat3.user.business.dto.response.UserResponseDto;

import java.util.Set;

public interface UserService {
    UserResponseDto saveUser(UserRequestDto request);
    UserResponseDto updateUser(String refNo, UserRequestDto request);
    void deleteUser(Long id);
    UserResponseDto getUserById(Long id);
    UserResponseDto getUserByRefNo(String refNo);
    Set<UserResponseDto> getAllUsers();
}
