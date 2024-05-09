package com.example.talabat.restaurant.presintation.controller;

import com.example.talabat.restaurant.business.dto.request.RestaurantRequestDto;
import com.example.talabat.restaurant.business.dto.response.RestaurantResponseDto;
import com.example.talabat.restaurant.business.service.serviceimpl.RestaurantServiceImpl;
import com.example.talabat.restaurant.business.service.services.RestaurantService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/api/v1/restaurants")
@RequiredArgsConstructor
public class RestaurantController {

    private final RestaurantService restaurantService;

    @GetMapping("/allRestaurants")
    public Set<RestaurantResponseDto> allRestaurants() {
        return restaurantService.getAllRestaurants();
    }

    @PostMapping("/saveRestaurant")
    public RestaurantResponseDto saveRestaurant(@RequestBody RestaurantRequestDto request) {
        return restaurantService.saveRestaurant(request);
    }

    @GetMapping("/getRestaurantByRefNo/{refNo}")
    public RestaurantResponseDto getRestaurantByRefNo(@PathVariable String refNo) {
        return restaurantService.getRestaurantByRefNo(refNo);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteRestaurantById(@PathVariable Long id){
        restaurantService.deleteRestaurantById(id);
    }
}
