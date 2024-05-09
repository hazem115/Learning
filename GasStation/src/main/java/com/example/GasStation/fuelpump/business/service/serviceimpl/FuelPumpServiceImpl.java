package com.example.GasStation.fuelpump.business.service.serviceimpl;

import com.example.GasStation.fuelpump.business.dto.FuelPumpMapper;
import com.example.GasStation.fuelpump.business.dto.request.FuelPumpRequestDto;
import com.example.GasStation.fuelpump.business.dto.response.FuelPumpResponseDto;
import com.example.GasStation.fuelpump.business.service.services.FuelPumpService;
import com.example.GasStation.fuelpump.presistance.entity.FuelPump;
import com.example.GasStation.fuelpump.presistance.repo.FuelPumpRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class FuelPumpServiceImpl implements FuelPumpService {
    private final FuelPumpRepo fuelPumpRepo;
    private final FuelPumpMapper fuelPumpMapper;

    @Override
    public FuelPumpResponseDto create(FuelPumpRequestDto request) {
        FuelPump fuelPump = fuelPumpRepo.save(fuelPumpMapper.dtoToEntity(request));
        return fuelPumpMapper.entityToDto(fuelPump);
    }

    @Override
    public FuelPumpResponseDto update(String refNo, FuelPumpRequestDto request) {
        FuelPump oldFuelPump = fuelPumpRepo.getByRefNo(refNo);
        FuelPump fuelPumpToUpdate = fuelPumpMapper.dtoToEntity(request);
        fuelPumpToUpdate.setId(oldFuelPump.getId());
        return fuelPumpMapper.entityToDto(fuelPumpRepo.save(fuelPumpToUpdate));
    }

    @Override
    public void deleteById(Long id){
        fuelPumpRepo.deleteById(id);
    }

    @Override
    public FuelPumpResponseDto findById(Long id) {
        FuelPump fuelPump = fuelPumpRepo.findById(id).orElse(null);
        return fuelPumpMapper.entityToDto(fuelPump);
    }

    @Override
    public Set<FuelPumpResponseDto> findAll() {
        List<FuelPump> result = fuelPumpRepo.findAll();
        return fuelPumpMapper.entityToDto(new HashSet<>(result));
    }
    @Override
    public FuelPumpResponseDto findByRefNo(String refNo) {
        FuelPump fuelPump = fuelPumpRepo.getByRefNo(refNo);
        return fuelPumpMapper.entityToDto(fuelPump);
    }
}
