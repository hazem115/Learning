package com.example.GasStation.carserviceTransaction.presintation.controller;

import com.example.GasStation.carserviceTransaction.business.dto.request.CarServiceTransactionRequestDto;
import com.example.GasStation.carserviceTransaction.business.dto.response.CarServiceTransactionResponseDto;
import com.example.GasStation.carserviceTransaction.business.service.services.CarServiceTransactionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/carServiceTransaction")
public class CarServiceTransactionController {
    private final CarServiceTransactionService service;

    @PostMapping("/create")
    public CarServiceTransactionResponseDto createCarServiceTransaction(@RequestBody CarServiceTransactionRequestDto request){
        return service.create(request);
    }
    @PutMapping("/update/{refNo}")
    public CarServiceTransactionResponseDto updateCarServiceTransaction(@PathVariable String refNo ,@RequestBody CarServiceTransactionRequestDto request){
        return service.update(refNo, request);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteCarServiceTransaction(@PathVariable Long id){
        service.deleteById(id);
    }
    @GetMapping("/getById/{id}")
    public CarServiceTransactionResponseDto getCarServiceTransaction(@PathVariable Long id){
        return service.findById(id);
    }
    @GetMapping("/getByRefNo/{refNo}")
    public CarServiceTransactionResponseDto getCarServiceTransactionByRefNo(@PathVariable String refNo){
        return service.findByRefNo(refNo);
    }
    @GetMapping("/getAll")
    public Set<CarServiceTransactionResponseDto> getAllCarServiceTransaction(){
        return service.findAll();
    }
}
