package com.example.GasStation.supermarket.presintation.controller;

import com.example.GasStation.supermarket.business.dto.request.SuperMarketRequestDto;
import com.example.GasStation.supermarket.business.dto.response.SuperMarketResponseDto;
import com.example.GasStation.supermarket.business.service.services.SuperMarketService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/api/v1/supermarket")
@RequiredArgsConstructor
public class SuperMarketController {
    private final SuperMarketService superMarketService;
    @PostMapping("/create")
    public SuperMarketResponseDto createSuperMarket(@RequestBody SuperMarketRequestDto request) {
        return superMarketService.create(request);
    }
    @PutMapping("/update/{refNo}")
    public SuperMarketResponseDto updateSuperMarket(@PathVariable String refNo,@RequestBody SuperMarketRequestDto request) {
        return superMarketService.update(refNo , request);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteSuperMarket(@PathVariable Long id){
        superMarketService.deleteById(id);
    }
    @GetMapping("/getById/{id}")
    public SuperMarketResponseDto getSuperMarketById(@PathVariable Long id){
        return superMarketService.findById(id);
    }
    @GetMapping("/getByRefNo/{refNo}")
    public SuperMarketResponseDto getSuperMarketByRefNo(@PathVariable String refNo){
        return superMarketService.findByRefNo(refNo);
    }
    @GetMapping("/getAll")
    public Set<SuperMarketResponseDto> getAllSuperMarket(){
        return superMarketService.findAll();
    }
}
