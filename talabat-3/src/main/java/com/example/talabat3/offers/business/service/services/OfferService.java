package com.example.talabat3.offers.business.service.services;

import com.example.talabat3.offers.business.dto.request.OfferRequestDto;
import com.example.talabat3.offers.business.dto.response.OfferResponseDto;

import java.util.Set;

public interface OfferService {
    OfferResponseDto saveOffer(OfferRequestDto request);
    OfferResponseDto updateOffer(String refNo, OfferRequestDto request);
    void deleteOffer(Long id);
    OfferResponseDto getOfferByRefNo(String refNo);
    Set<OfferResponseDto> getAllOffers();
    OfferResponseDto getOfferById(Long id);
}
