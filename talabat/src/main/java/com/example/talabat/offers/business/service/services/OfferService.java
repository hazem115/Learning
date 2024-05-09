package com.example.talabat.offers.business.service.services;

import com.example.talabat.offers.business.dto.request.OffersRequestDto;
import com.example.talabat.offers.business.dto.response.OffersResponseDto;

import java.util.Set;

public interface OfferService {

    Set<OffersResponseDto> getAllOffers();
    OffersResponseDto saveOffers(OffersRequestDto request);
    OffersResponseDto findByRefNo(String refNo);
    OffersResponseDto findRestaurantByRefNo(String refNo);
    void deleteOfferById(Long id);
}
