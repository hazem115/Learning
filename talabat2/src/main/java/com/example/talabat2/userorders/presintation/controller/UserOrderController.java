package com.example.talabat2.userorders.presintation.controller;

import com.example.talabat2.userorders.business.dto.response.UserOrderResponseDto;
import com.example.talabat2.userorders.business.service.services.UserOrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping("/api/v1/userOrders")
@RequiredArgsConstructor
public class UserOrderController {

    private final UserOrderService userOrderService;
    @GetMapping("/allUserOrders")
    public Set<UserOrderResponseDto> getAllUserOrders() {
        return userOrderService.getAllUserOrders();
    }

}
