package com.example.talabat3.restaurant.presintation.controller;

import com.example.talabat3.restaurant.business.dto.request.RestaurantRequestDto;
import com.example.talabat3.restaurant.business.dto.response.RestaurantResponseDto;
import com.example.talabat3.restaurant.business.service.services.RestaurantService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/restaurants")
public class RestaurantController {
    private final RestaurantService restaurantService;

    @PostMapping("/saveRestaurant")
    public RestaurantResponseDto saveRestaurant(@RequestBody RestaurantRequestDto request){
        return restaurantService.saveRestaurant(request);
    }
    @PutMapping("/updateRestaurant/{refNo}")
    public RestaurantResponseDto updateRestaurant(@PathVariable String refNo,@RequestBody RestaurantRequestDto request){
        return restaurantService.updateRestaurant(refNo, request);
    }
    @DeleteMapping("/deleteRestaurant/{id}")
    public void deleteRestaurant(@PathVariable Long id){
        restaurantService.deleteRestaurantById(id);
    }
    @GetMapping("/getRestaurantByRefNo/{refNo}")
    public RestaurantResponseDto getByRefNo(@PathVariable String refNo) {
        return restaurantService.getByRefNo(refNo);
    }
    @GetMapping("/getRestaurantById/{id}")
    public RestaurantResponseDto getById(@PathVariable Long id) {
        return restaurantService.getById(id);
    }
    @GetMapping("/getAllRestaurants")
    public Set<RestaurantResponseDto> getAllRestaurants() {
        return restaurantService.getAllRestaurants();
    }
}
