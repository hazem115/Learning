package com.example.talabat2.restaurant.presintation.controller;

import com.example.talabat2.restaurant.business.dto.request.RestaurantRequestDto;
import com.example.talabat2.restaurant.business.dto.response.RestaurantResponseDto;
import com.example.talabat2.restaurant.business.service.services.RestaurantService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/api/v1/restaurants")
@RequiredArgsConstructor
public class RestaurantController {

    private final RestaurantService restaurantService;

    @GetMapping("/allRestaurants")
    public Set<RestaurantResponseDto> getAllRestaurants() {
        return restaurantService.getAllRestaurants();
    }

    @PostMapping("/saveRestaurant")
    public RestaurantResponseDto saveRestaurant(@RequestBody RestaurantRequestDto request){
        return restaurantService.saveRestaurant(request);
    }

    @GetMapping("/getRestaurantByRefNo/{refNo}")
    public RestaurantResponseDto getByRefNo(@PathVariable String refNo){
        return restaurantService.getByRefNo(refNo);
    }

    @GetMapping("/getById/{id}")
    public RestaurantResponseDto getById(@PathVariable Long id){
        return restaurantService.getById(id);
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable Long id){
        restaurantService.deleteById(id);
    }
    @PutMapping ("/update/{refNo}")
    public RestaurantResponseDto updateRestaurant(@PathVariable String refNo, RestaurantRequestDto request){
        return restaurantService.updateRestaurant(refNo, request);
    }
}
