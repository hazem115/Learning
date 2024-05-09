package com.example.talabat3.user.presintation.controller;

import com.example.talabat3.user.business.dto.request.UserRequestDto;
import com.example.talabat3.user.business.dto.response.UserResponseDto;
import com.example.talabat3.user.business.service.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/users")
public class UserController {
    private final UserService userService;
    @PostMapping("/saveUser")
    public UserResponseDto saveUser(@RequestBody UserRequestDto request){
        return userService.saveUser(request);
    }
    @PutMapping("/updateUser/{refNo}")
    public UserResponseDto updateUser(@PathVariable String refNo, @RequestBody UserRequestDto request){
        return userService.updateUser(refNo, request);
    }
    @DeleteMapping("/deleteUser/{id}")
    public void deleteUser(@PathVariable Long id){
        userService.deleteUser(id);
    }
    @GetMapping("/getUserById/{id}")
    public UserResponseDto getUserById(@PathVariable Long id){
        return userService.getUserById(id);
    }
    @GetMapping("/getUserByRefNo/{refNo}")
    public UserResponseDto getUserByRefNo(@PathVariable String refNo){
        return userService.getUserByRefNo(refNo);
    }
    @GetMapping("/getAllUsers")
    public Set<UserResponseDto> getAllUsers(){
        return userService.getAllUsers();
    }

}
