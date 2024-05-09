package com.example.GasStation.fuelpump.presintation.controller;

import com.example.GasStation.fuelpump.business.dto.request.FuelPumpRequestDto;
import com.example.GasStation.fuelpump.business.dto.response.FuelPumpResponseDto;
import com.example.GasStation.fuelpump.business.service.services.FuelPumpService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/fuelPumps")
public class FuelPumpController {
    private final FuelPumpService fuelPumpService;
    @PostMapping("/saveFuelPump")
    public FuelPumpResponseDto createPump(@RequestBody FuelPumpRequestDto request){
        return fuelPumpService.create(request);
    }
    @PutMapping("/updateFuelPump/{refNo}")
    public FuelPumpResponseDto updatePump(@PathVariable String refNo, @RequestBody FuelPumpRequestDto request){
        return fuelPumpService.update(refNo, request);
    }
    @DeleteMapping("/deleteFuelPump/{id}")
    public void deletePump(@PathVariable Long id){
        fuelPumpService.deleteById(id);
    }
    @GetMapping("/getAllPumps")
    public Set<FuelPumpResponseDto> getAllPumps(){
        return fuelPumpService.findAll();
    }
    @GetMapping("/getFuelPumpById/{id}")
    public FuelPumpResponseDto getPumpById(@PathVariable Long id){
        return fuelPumpService.findById(id);
    }
    @GetMapping("/getFuelPumpByRefNo/{refNo}")
    public FuelPumpResponseDto getPumpByRefNo(@PathVariable String refNo){
        return fuelPumpService.findByRefNo(refNo);
    }
}
