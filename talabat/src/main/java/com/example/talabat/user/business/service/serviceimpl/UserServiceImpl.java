package com.example.talabat.user.business.service.serviceimpl;

import com.example.talabat.user.business.dto.UserMapper;
import com.example.talabat.user.business.dto.request.UserDtoRequest;
import com.example.talabat.user.business.dto.response.UserDtoResponse;
import com.example.talabat.user.business.service.services.UserService;
import com.example.talabat.user.presistance.entity.User;
import com.example.talabat.user.presistance.repo.UserRepo;
import lombok.RequiredArgsConstructor;
import org.mapstruct.control.MappingControl;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepo userRepo;;
    private final UserMapper userMapper;

    @Override
    public Set<UserDtoResponse> getAllUsers() {
        List<User> users = userRepo.findAll();
        return userMapper.entityToDto(new HashSet<>(users));
    }

    @Override
    public UserDtoResponse saveUser(UserDtoRequest request) {
        User user = userRepo.save(userMapper.dtoToEntity(request));
        return userMapper.entityToDto(user);
    }

    @Override
    public UserDtoResponse getUserByRefNo(String refNo) {
        User user = userRepo.getUserByRefNo(refNo);
        return userMapper.entityToDto(user);
    }

    @Override
    public void deleteUserById(Long id) {
        userRepo.deleteById(id);
    }

}
