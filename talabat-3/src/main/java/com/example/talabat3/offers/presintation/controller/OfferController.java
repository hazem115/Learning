package com.example.talabat3.offers.presintation.controller;

import com.example.talabat3.offers.business.dto.request.OfferRequestDto;
import com.example.talabat3.offers.business.dto.response.OfferResponseDto;
import com.example.talabat3.offers.business.service.services.OfferService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/api/v1/offers")
@RequiredArgsConstructor
public class OfferController {
    private final OfferService offerService;

    @PostMapping("/saveOffer")
    public OfferResponseDto saveOffer(@RequestBody OfferRequestDto request){
        return offerService.saveOffer(request);
    }
    @PutMapping("/updateOffer/{refNo}")
    public OfferResponseDto updateOffer(@PathVariable String refNo,@RequestBody OfferRequestDto request){
        return offerService.updateOffer(refNo, request);
    }
    @DeleteMapping("/deleteById/{id}")
    public void deleteOfferById(@PathVariable Long id){
        offerService.deleteOffer(id);
    }
    @GetMapping("/getOfferById/{id}")
    public OfferResponseDto getOfferById(@PathVariable Long id){
        return offerService.getOfferById(id);
    }
    @GetMapping("/getOfferByRefNo/{refNo}")
    public OfferResponseDto getOfferByRefNo(@PathVariable String refNo){
        return offerService.getOfferByRefNo(refNo);
    }
    @GetMapping("/getAllOffers")
    public Set<OfferResponseDto> getAllOffers(){
        return offerService.getAllOffers();
    }
}
