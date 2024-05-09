package com.example.GasStation.transactions.presintation.controller;

import com.example.GasStation.transactions.business.dto.request.TransactionRequestDto;
import com.example.GasStation.transactions.business.dto.response.TransactionResponseDto;
import com.example.GasStation.transactions.business.service.services.TransactionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/transactions")
public class TransactionController {
    private final TransactionService transactionService;
    @PostMapping("/create")
    public TransactionResponseDto createTransaction(@RequestBody TransactionRequestDto request){
        return transactionService.create(request);
    }
    @PutMapping("/update/{refNo}")
    public TransactionResponseDto updateTransaction(@PathVariable String refNo, @RequestBody TransactionRequestDto request){
        return transactionService.update(refNo, request);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteTransaction(@PathVariable Long id){
        transactionService.deleteById(id);
    }
    @GetMapping("/getById/{id}")
    public TransactionResponseDto getTransactionById(@PathVariable Long id){
        return transactionService.findById(id);
    }
    @GetMapping("/getByRefNo/{refNo}")
    public TransactionResponseDto getTransactionByRefNo(@PathVariable String refNo){
        return transactionService.findByRefNo(refNo);
    }
    @GetMapping("/getAll")
    public Set<TransactionResponseDto> getAllTransactions(){
        return transactionService.findAll();
    }
}
