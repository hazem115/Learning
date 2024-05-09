package com.example.talabat2.offers.presintation.controller;

import com.example.talabat2.offers.business.dto.request.OfferRequestDto;
import com.example.talabat2.offers.business.dto.response.OfferResponseDto;
import com.example.talabat2.offers.business.service.services.OfferService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/api/v/offers")
@RequiredArgsConstructor
public class OfferController {
    private final OfferService offerService;
    @GetMapping("/allOffers")
    public Set<OfferResponseDto> getAllOffers() {
        return offerService.getAllOffers();
    }

    @PostMapping("/saveOffer")
    public OfferResponseDto saveOffer(@RequestBody OfferRequestDto request){
        return offerService.saveOffer(request);
    }

    @GetMapping("/getOfferByRefNo/{refNo}")
    public OfferResponseDto getOfferByRefNo(@PathVariable String refNo){
        return offerService.getOfferByRefNo(refNo);
    }

    @GetMapping("/getOfferById/{id}")
    public OfferResponseDto getOfferById(@PathVariable Long id){
        return offerService.getOfferById(id);
    }

    @DeleteMapping("/deleteOfferById/{id}")
    public void deleteOfferById(@PathVariable Long id){
        offerService.deleteOfferById(id);
    }

    @PutMapping("/update/{refNo}")
    public OfferResponseDto update(@PathVariable String refNo, @RequestBody OfferRequestDto request){
        return offerService.updateOffer(refNo, request);
    }
}
