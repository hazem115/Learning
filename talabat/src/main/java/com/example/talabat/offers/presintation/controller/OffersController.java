package com.example.talabat.offers.presintation.controller;

import com.example.talabat.offers.business.dto.request.OffersRequestDto;
import com.example.talabat.offers.business.dto.response.OffersResponseDto;
import com.example.talabat.offers.business.service.services.OfferService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/offers")
public class OffersController {

    private final OfferService offerService;
    @GetMapping("/allOffers")
    public Set<OffersResponseDto> getAllOffers(){
        return offerService.getAllOffers();
    }

    @PostMapping("/saveOffer")
    public OffersResponseDto saveOffers(@RequestBody OffersRequestDto request){
        return offerService.saveOffers(request);
    }

    @GetMapping("/getByRefNo/{refNo}")
    public OffersResponseDto getByRefNo(@PathVariable String refNo){
        return offerService.findByRefNo(refNo);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteOfferById(@PathVariable Long id){
        offerService.deleteOfferById(id);
    }
}
