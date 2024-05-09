package com.example.GasStation.pricing.presintation.controller;

import com.example.GasStation.pricing.business.dto.request.PricingRequestDto;
import com.example.GasStation.pricing.business.dto.response.PricingResponseDto;
import com.example.GasStation.pricing.business.service.services.PricingService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/pricing")
public class PricingController {
    private final PricingService pricingService;
    @PostMapping("/create")
    public PricingResponseDto create(@RequestBody PricingRequestDto request){
        return pricingService.create(request);
    }
    @PutMapping("/update/{refNo}")
    public PricingResponseDto update(@PathVariable String refNo,@RequestBody PricingRequestDto request){
        return pricingService.update(refNo, request);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable Long id){
        pricingService.deleteById(id);
    }
    @GetMapping("/getById/{id}")
    public PricingResponseDto getById(@PathVariable Long id){
        return pricingService.findById(id);
    }
    @GetMapping("/getByRefNo/{refNo}")
    public PricingResponseDto getByRefNo(@PathVariable String refNo){
        return pricingService.findByRefNo(refNo);
    }
    @GetMapping("/getAll")
    public Set<PricingResponseDto> getAll(){
        return pricingService.findAll();
    }
}
