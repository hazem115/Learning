package com.example.talabat2.restaurant.business.service.serviceimpl;

import com.example.talabat2.restaurant.business.dto.RestaurantMapper;
import com.example.talabat2.restaurant.business.dto.request.RestaurantRequestDto;
import com.example.talabat2.restaurant.business.dto.response.RestaurantResponseDto;
import com.example.talabat2.restaurant.business.service.services.RestaurantService;
import com.example.talabat2.restaurant.presistance.entity.Restaurant;
import com.example.talabat2.restaurant.presistance.repo.RestaurantRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class RestaurantServiceImpl implements RestaurantService {

    private final RestaurantMapper restaurantMapper;
    private final RestaurantRepo restaurantRepo;
    @Override
    public Set<RestaurantResponseDto> getAllRestaurants() {
        List<Restaurant> restaurants = restaurantRepo.findAll();
        return restaurantMapper.entityToDto(new HashSet<>(restaurants));
    }

    @Override
    public RestaurantResponseDto saveRestaurant(RestaurantRequestDto request) {
        Restaurant restaurant = restaurantRepo.save(restaurantMapper.dtoToEntity(request));
        return restaurantMapper.entityToDto(restaurant);
    }

    @Override
    public RestaurantResponseDto getByRefNo(String refNo) {
        Restaurant restaurant = restaurantRepo.getByRefNo(refNo);
        return restaurantMapper.entityToDto(restaurant);
    }

    @Override
    public RestaurantResponseDto getById(Long id) {
        Restaurant restaurant = restaurantRepo.findById(id).orElse(null);
        return restaurantMapper.entityToDto(restaurant);
    }

    @Override
    public void deleteById(Long id) {
        restaurantRepo.deleteById(id);
    }

    @Override
    public RestaurantResponseDto updateRestaurant(String refNo, RestaurantRequestDto request) {
        Restaurant oldRestaurant = restaurantRepo.getByRefNo(refNo);
        Restaurant restaurantToUpdate = restaurantMapper.dtoToEntity(request);
        restaurantToUpdate.setId(oldRestaurant.getId());
        return restaurantMapper.entityToDto(restaurantRepo.save(restaurantToUpdate));
    }
}
