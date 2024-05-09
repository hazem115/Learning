package com.example.GasStation.supermarketTransaction.business.service.serviceimpl;

import com.example.GasStation.supermarketTransaction.business.dto.SuperMarketTransactionMapper;
import com.example.GasStation.supermarketTransaction.business.dto.request.SuperMarketTransactionRequestDto;
import com.example.GasStation.supermarketTransaction.business.dto.response.SuperMarketTransactionResponseDto;
import com.example.GasStation.supermarketTransaction.business.service.services.SuperMarketTransactionService;
import com.example.GasStation.supermarketTransaction.presistance.entity.SuperMarketTransaction;
import com.example.GasStation.supermarketTransaction.presistance.repo.SuperMarketTransactionRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class SuperMarketTransactionServiceImpl implements SuperMarketTransactionService {
    private final SuperMarketTransactionMapper mapper;
    private final SuperMarketTransactionRepo repo;

    @Override
    public SuperMarketTransactionResponseDto create(SuperMarketTransactionRequestDto request) {
        SuperMarketTransaction transaction = repo.save(mapper.dtoToEntity(request));
        return mapper.entityToDto(transaction);
    }

    @Override
    public SuperMarketTransactionResponseDto update(String refNo, SuperMarketTransactionRequestDto request) {
        SuperMarketTransaction oldTransaction = repo.findByRefNo(refNo);
        SuperMarketTransaction newTransaction = mapper.dtoToEntity(request);
        newTransaction.setId(oldTransaction.getId());
        return mapper.entityToDto(repo.save(newTransaction));
    }

    @Override
    public void deleteById(Long id) {
        repo.deleteById(id);
    }

    @Override
    public SuperMarketTransactionResponseDto findById(Long id) {
        SuperMarketTransaction response = repo.findById(id).orElse(null);
        return mapper.entityToDto(response);
    }

    @Override
    public Set<SuperMarketTransactionResponseDto> findAll() {
        List<SuperMarketTransaction> result= repo.findAll();
        return mapper.entityToDto(new HashSet<>(result));
    }

    @Override
    public SuperMarketTransactionResponseDto findByRefNo(String refNo) {
        SuperMarketTransaction result= repo.findByRefNo(refNo);
        return mapper.entityToDto(result);
    }
}
