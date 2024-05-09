package com.example.talabat.userorders.business.dto;

import com.example.talabat.category.presistance.entity.Category;
import com.example.talabat.restaurant.presistance.entity.Restaurant;
import com.example.talabat.user.presistance.entity.User;
import com.example.talabat.userorders.business.dto.request.UserOrdersRequestDto;
import com.example.talabat.userorders.business.dto.response.UserOrdersResponseDto;
import com.example.talabat.userorders.presistance.entity.UserOrders;
import org.mapstruct.*;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
@Mapper(componentModel = "spring",
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS,
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
        uses = {User.class , Category.class, Restaurant.class})
public interface UserOrdersMapper {

    UserOrdersResponseDto entityToDto(UserOrders userOrders);
    Set<UserOrdersResponseDto> entityToDto(Set<UserOrders> userOrders);
    UserOrders dtoToEntity(UserOrdersRequestDto userOrdersRequestDto);
    Set<UserOrders> dtoToEntity(Set<UserOrdersRequestDto> userOrdersRequestDto);

}
