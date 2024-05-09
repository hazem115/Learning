package com.example.talabat.user.business.service.services;

import com.example.talabat.user.business.dto.request.UserDtoRequest;
import com.example.talabat.user.business.dto.response.UserDtoResponse;
import com.example.talabat.user.presistance.entity.User;

import java.util.Set;

public interface UserService {
    Set<UserDtoResponse> getAllUsers();
    UserDtoResponse saveUser(UserDtoRequest request);
    UserDtoResponse getUserByRefNo(String refNo);
    void deleteUserById(Long id);
}
