package com.example.talabat.offers.business.dto;

import com.example.talabat.category.presistance.entity.Category;
import com.example.talabat.offers.business.dto.request.OffersRequestDto;
import com.example.talabat.offers.business.dto.response.OffersResponseDto;
import com.example.talabat.offers.presistance.entity.Offers;
import com.example.talabat.restaurant.presistance.entity.Restaurant;
import com.example.talabat.user.presistance.entity.User;
import org.mapstruct.*;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
@Mapper(componentModel = "spring",
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS,
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
        uses = {Restaurant.class , User.class , Category.class})
public interface OffersMapper {

    OffersResponseDto entityToDto(Offers offers);
    Set<OffersResponseDto> entityToDto(Set<Offers> offers);
    Offers dtoToEntity(OffersRequestDto request);
    Set<Offers> dtoToEntity(Set<OffersRequestDto> request);

}
