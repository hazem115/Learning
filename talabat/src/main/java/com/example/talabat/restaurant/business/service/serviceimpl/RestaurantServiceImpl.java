package com.example.talabat.restaurant.business.service.serviceimpl;

import com.example.talabat.category.presistance.repo.CategoryRepo;
import com.example.talabat.restaurant.business.dto.RestaurantMapper;
import com.example.talabat.restaurant.business.dto.request.RestaurantRequestDto;
import com.example.talabat.restaurant.business.dto.response.RestaurantResponseDto;
import com.example.talabat.restaurant.business.service.services.RestaurantService;
import com.example.talabat.restaurant.presistance.entity.Restaurant;
import com.example.talabat.restaurant.presistance.repo.RestaurantRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class RestaurantServiceImpl implements RestaurantService {
     private final RestaurantMapper restaurantMapper;
     private final RestaurantRepo restaurantRepo;

    @Override
    public Set<RestaurantResponseDto> getAllRestaurants() {
        List<Restaurant> Rests = restaurantRepo.findAll();
        return restaurantMapper.entityToDto(new HashSet<>(Rests));
    }

    @Override
    public RestaurantResponseDto saveRestaurant(RestaurantRequestDto request) {
        Restaurant restaurant = restaurantRepo.save(restaurantMapper.dtoToEntity(request));
        return restaurantMapper.entityToDto(restaurant);
    }

    @Override
    public RestaurantResponseDto getRestaurantByRefNo(String refNo) {
        Restaurant restaurant = restaurantRepo.getRestaurantByRefNo(refNo);
        return restaurantMapper.entityToDto(restaurant);
    }

    @Override
    public void deleteRestaurantById(Long id) {
        restaurantRepo.deleteById(id);
    }
}
