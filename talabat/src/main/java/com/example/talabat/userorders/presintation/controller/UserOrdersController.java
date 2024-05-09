package com.example.talabat.userorders.presintation.controller;

import com.example.talabat.userorders.business.dto.request.UserOrdersRequestDto;
import com.example.talabat.userorders.business.dto.response.UserOrdersResponseDto;
import com.example.talabat.userorders.business.service.services.UserOrdersService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/api/v1/userOrders")
@RequiredArgsConstructor
public class UserOrdersController {

    private final UserOrdersService userOrdersService;

    @GetMapping("/allUserOrders")
    public Set<UserOrdersResponseDto> allUserHistories() {
        return userOrdersService.getUserOrders();
    }

    @PostMapping("/saveUserOrders")
    public UserOrdersResponseDto saveUserOrders(@RequestBody UserOrdersRequestDto request) {
        return userOrdersService.saveUserOrders(request);
    }

    @GetMapping("/getByRefNo/{refNo}")
    public UserOrdersResponseDto getByRefNo(@PathVariable String refNo){
        return userOrdersService.getUserOrdersByRefNo(refNo);
    }

}
