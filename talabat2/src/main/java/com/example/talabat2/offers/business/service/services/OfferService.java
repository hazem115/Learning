package com.example.talabat2.offers.business.service.services;

import com.example.talabat2.offers.business.dto.request.OfferRequestDto;
import com.example.talabat2.offers.business.dto.response.OfferResponseDto;

import java.util.Set;

public interface OfferService {
    Set<OfferResponseDto> getAllOffers();

    OfferResponseDto saveOffer(OfferRequestDto request);

    OfferResponseDto getOfferByRefNo(String refNo);

    OfferResponseDto getOfferById(Long id);

    void deleteOfferById(Long id);

    OfferResponseDto updateOffer(String refNo, OfferRequestDto offer);
}
