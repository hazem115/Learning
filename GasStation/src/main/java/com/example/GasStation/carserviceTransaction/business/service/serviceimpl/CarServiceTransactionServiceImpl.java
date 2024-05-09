package com.example.GasStation.carserviceTransaction.business.service.serviceimpl;

import com.example.GasStation.carserviceTransaction.business.dto.CarServiceTransactionMapper;
import com.example.GasStation.carserviceTransaction.business.dto.request.CarServiceTransactionRequestDto;
import com.example.GasStation.carserviceTransaction.business.dto.response.CarServiceTransactionResponseDto;
import com.example.GasStation.carserviceTransaction.business.service.services.CarServiceTransactionService;
import com.example.GasStation.carserviceTransaction.presistance.entity.CarServiceTransaction;
import com.example.GasStation.carserviceTransaction.presistance.repo.CarServiceTransactionRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class CarServiceTransactionServiceImpl implements CarServiceTransactionService {
    private final CarServiceTransactionMapper mapper;
    private final CarServiceTransactionRepo repo;
    @Override
    public CarServiceTransactionResponseDto create(CarServiceTransactionRequestDto request) {
        CarServiceTransaction transaction = repo.save(mapper.dtoToEntity(request));
        return mapper.entityToDto(transaction);
    }

    @Override
    public CarServiceTransactionResponseDto update(String refNo, CarServiceTransactionRequestDto request) {
        CarServiceTransaction oldTransaction = repo.getByRefNo(refNo);
        CarServiceTransaction newTransaction = mapper.dtoToEntity(request);
        newTransaction.setId(oldTransaction.getId());
        return mapper.entityToDto(repo.save(newTransaction));
    }

    @Override
    public void deleteById(Long id) {
        repo.deleteById(id);
    }

    @Override
    public CarServiceTransactionResponseDto findById(Long id) {
        CarServiceTransaction transaction = repo.findById(id).orElse(null);
        return mapper.entityToDto(transaction);
    }

    @Override
    public Set<CarServiceTransactionResponseDto> findAll() {
        List<CarServiceTransaction> result = repo.findAll();
        return mapper.entityToDto(new HashSet<>(result));
    }

    @Override
    public CarServiceTransactionResponseDto findByRefNo(String refNo) {
        CarServiceTransaction result = repo.getByRefNo(refNo);
        return mapper.entityToDto(result);
    }
}
