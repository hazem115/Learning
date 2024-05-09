package com.example.talabat2.user.presintation.controller;

import com.example.talabat2.user.business.dto.request.UserRequestDto;
import com.example.talabat2.user.business.dto.response.UserResponseDto;
import com.example.talabat2.user.business.service.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/allUsers")
    public Set<UserResponseDto> getAllUsers() {
        return userService.getAllUsers();
    }

    @PostMapping("/saveUser")
    public UserResponseDto saveUser(@RequestBody UserRequestDto request){
        return userService.saveUser(request);
    }
    @GetMapping("/getByRefNo/{refNo}")
    public UserResponseDto getByRefNo(@PathVariable String refNo){
        return userService.getByRefNo(refNo);
    }
    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable Long id){
        userService.deleteById(id);
    }

    @GetMapping("/getById/{id}")
    public UserResponseDto getById(@PathVariable Long id){
        return userService.getById(id);
    }

    @PutMapping("/update/{refNo}")
    public UserResponseDto updateUser(@PathVariable String refNo, UserRequestDto request){
        return userService.updateUser(refNo, request);
    }
}
