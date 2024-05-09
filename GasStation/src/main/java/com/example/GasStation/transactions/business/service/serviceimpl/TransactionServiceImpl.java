package com.example.GasStation.transactions.business.service.serviceimpl;

import com.example.GasStation.transactions.business.dto.TransactionMapper;
import com.example.GasStation.transactions.business.dto.request.TransactionRequestDto;
import com.example.GasStation.transactions.business.dto.response.TransactionResponseDto;
import com.example.GasStation.transactions.business.service.services.TransactionService;
import com.example.GasStation.transactions.presistance.entity.Transaction;
import com.example.GasStation.transactions.presistance.repo.TransactionRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class TransactionServiceImpl implements TransactionService {
    private final TransactionMapper transactionMapper;
    private final TransactionRepo transactionRepo;
    @Override
    public TransactionResponseDto create(TransactionRequestDto request) {
        Transaction transaction = transactionRepo.save(transactionMapper.dtoToEntity(request));
        return transactionMapper.entityToDto(transaction);
    }

    @Override
    public TransactionResponseDto update(String refNo, TransactionRequestDto request) {
        Transaction oldTransaction = transactionRepo.getByRefNo(refNo);
        Transaction newTransaction = transactionMapper.dtoToEntity(request);
        newTransaction.setId(oldTransaction.getId());
        return transactionMapper.entityToDto(transactionRepo.save(newTransaction));
    }

    @Override
    public void deleteById(Long id) {
        transactionRepo.deleteById(id);
    }

    @Override
    public TransactionResponseDto findById(Long id) {
        Transaction transaction = transactionRepo.findById(id).orElse(null);
        return transactionMapper.entityToDto(transaction);
    }

    @Override
    public Set<TransactionResponseDto> findAll() {
        List<Transaction> result = transactionRepo.findAll();
        return transactionMapper.entityToDto(new HashSet<>(result));
    }

    @Override
    public TransactionResponseDto findByRefNo(String refNo) {
        Transaction transaction = transactionRepo.getByRefNo(refNo);
        return transactionMapper.entityToDto(transaction);
    }
}
