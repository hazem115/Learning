package com.example.talabat3.user.business.service.serviceimpl;

import com.example.talabat3.user.business.dto.UserMapper;
import com.example.talabat3.user.business.dto.request.UserRequestDto;
import com.example.talabat3.user.business.dto.response.UserResponseDto;
import com.example.talabat3.user.business.service.services.UserService;
import com.example.talabat3.user.presistance.entity.User;
import com.example.talabat3.user.presistance.repo.UserRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepo userRepo;
    private final UserMapper userMapper;
    @Override
    public UserResponseDto saveUser(UserRequestDto request) {
        User user = userRepo.save(userMapper.dtoToEntity(request));
        return userMapper.entityToDto(user);
    }

    @Override
    public UserResponseDto updateUser(String refNo, UserRequestDto request) {
        User oldUser = userRepo.getByRefNo(refNo);
        User userToUpdate = userMapper.dtoToEntity(request);
        userToUpdate.setId(oldUser.getId());
        return userMapper.entityToDto(userRepo.save(userToUpdate));
    }

    @Override
    public void deleteUser(Long id) {
        userRepo.deleteById(id);
    }

    @Override
    public UserResponseDto getUserById(Long id) {
        User user = userRepo.findById(id).orElse(null);
        return userMapper.entityToDto(user);
    }

    @Override
    public UserResponseDto getUserByRefNo(String refNo) {
        User user = userRepo.getByRefNo(refNo);
        return userMapper.entityToDto(user);
    }

    @Override
    public Set<UserResponseDto> getAllUsers() {
        List<User> users = userRepo.findAll();
        return userMapper.entityToDto(new HashSet<>(users));
    }
}
