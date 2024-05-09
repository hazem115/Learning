package com.example.GasStation.carservice.presintation.controller;

import com.example.GasStation.carservice.business.dto.request.CarServiceRequestDto;
import com.example.GasStation.carservice.business.dto.response.CarServiceResponseDto;
import com.example.GasStation.carservice.business.service.services.CarServiceServices;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
    @RequestMapping("/api/v1/carService")
@RequiredArgsConstructor
public class CarServiceController {
    private final CarServiceServices carServiceServices;
    @PostMapping("/createCarService")
    public CarServiceResponseDto createCarService(@RequestBody CarServiceRequestDto request){
        return carServiceServices.createCarService(request);
    }
    @PutMapping("/updateCarService/{refNo}")
    public CarServiceResponseDto updateCarService(@PathVariable String refNo,@RequestBody CarServiceRequestDto request){
        return carServiceServices.update(refNo, request);
    }
    @DeleteMapping("/deleteCarService/{id}")
    public void deleteCarService(@PathVariable Long id){
        carServiceServices.deleteById(id);
    }
    @GetMapping("/getAll")
    public Set<CarServiceResponseDto> getAllCarService(){
        return carServiceServices.getAllCarServices();
    }
    @GetMapping("/getCarServiceByRefNo/{refNo}")
    public CarServiceResponseDto getByRefNo(@PathVariable String refNo){
        return carServiceServices.findByRefNo(refNo);
    }
    @GetMapping("/getCarServiceById/{id}")
    public CarServiceResponseDto getCarServiceById(@PathVariable Long id){
        return carServiceServices.getCarServiceById(id);
    }
}
