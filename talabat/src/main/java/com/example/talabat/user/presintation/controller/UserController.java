package com.example.talabat.user.presintation.controller;

import com.example.talabat.user.business.dto.request.UserDtoRequest;
import com.example.talabat.user.business.dto.response.UserDtoResponse;
import com.example.talabat.user.business.service.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;
    @GetMapping("/allUsers")
    public Set<UserDtoResponse> getAllUsers(){
        return userService.getAllUsers();
    }

    @PostMapping("/saveUser")
    public UserDtoResponse saveUser(@RequestBody UserDtoRequest request){
        return userService.saveUser(request);
    }

    @GetMapping("/getByRefNo/{refNo}")
        public UserDtoResponse getByRefNo(@PathVariable String refNo){
            return userService.getUserByRefNo(refNo);
        }

    @DeleteMapping("/delete/{id}")
    public void deleteUserById(@PathVariable Long id){
        userService.deleteUserById(id);
    }
}
