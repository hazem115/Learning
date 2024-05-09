package com.example.GasStation.carservice.business.service.serviceimpl;

import com.example.GasStation.carservice.business.dto.CarServiceMapper;
import com.example.GasStation.carservice.business.dto.request.CarServiceRequestDto;
import com.example.GasStation.carservice.business.dto.response.CarServiceResponseDto;
import com.example.GasStation.carservice.business.service.services.CarServiceServices;
import com.example.GasStation.carservice.presistance.entity.CarService;
import com.example.GasStation.carservice.presistance.repo.CarServiceRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class CarServiceServicesImpl implements CarServiceServices {
    private final CarServiceRepo carServiceRepo;
    private final CarServiceMapper carServiceMapper;

    @Override
    public CarServiceResponseDto createCarService(CarServiceRequestDto request) {
        CarService carService = carServiceRepo.save(carServiceMapper.dtoToEntity(request));
        return carServiceMapper.entityToDto(carService);
    }
    @Override
    public CarServiceResponseDto update(String refNo, CarServiceRequestDto request) {
        CarService oldCarService = carServiceRepo.findByRefNo(refNo);
        CarService carServiceToUpdate = carServiceMapper.dtoToEntity(request);
        carServiceToUpdate.setId(oldCarService.getId());
        return carServiceMapper.entityToDto(carServiceRepo.save(carServiceToUpdate));
    }
    @Override
    public void deleteById  (Long id) {
        carServiceRepo.deleteById(id);
    }
    @Override
    public Set<CarServiceResponseDto> getAllCarServices() {
        List<CarService> result = carServiceRepo.findAll();
        return carServiceMapper.entityToDto(new HashSet<>(result));
    }
    @Override
    public CarServiceResponseDto getCarServiceById(Long id) {
        CarService carService = carServiceRepo.findById(id).orElse(null);
        return carServiceMapper.entityToDto(carService);
    }
    @Override
    public CarServiceResponseDto findByRefNo(String refNo) {
        CarService carService = carServiceRepo.findByRefNo(refNo);
        return carServiceMapper.entityToDto(carService);
    }
}
