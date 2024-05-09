package com.example.GasStation.supermarketTransaction.presintation.controller;

import com.example.GasStation.supermarketTransaction.business.dto.request.SuperMarketTransactionRequestDto;
import com.example.GasStation.supermarketTransaction.business.dto.response.SuperMarketTransactionResponseDto;
import com.example.GasStation.supermarketTransaction.business.service.services.SuperMarketTransactionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/api/v1/supermarketTransactions")
@RequiredArgsConstructor
public class SuperMarketTransactionController {
    private final SuperMarketTransactionService transactionService;
    @PostMapping("/create")
    public SuperMarketTransactionResponseDto createTransaction(@RequestBody SuperMarketTransactionRequestDto request){
        return transactionService.create(request);
    }
    @PutMapping("/update/{refNo}")
    public SuperMarketTransactionResponseDto updateTransaction(@PathVariable String refNo,@RequestBody SuperMarketTransactionRequestDto request){
        return transactionService.update(refNo, request);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteTransaction(@PathVariable Long id){
        transactionService.deleteById(id);
    }
    @GetMapping("/getById/{id}")
    public SuperMarketTransactionResponseDto getTransactionById(@PathVariable Long id){
        return transactionService.findById(id);
    }
    @GetMapping("/getByRefNo/{refNo}")
    public SuperMarketTransactionResponseDto getTransactionByRefNo(@PathVariable String refNo){
        return transactionService.findByRefNo(refNo);
    }
    @GetMapping("/getAll")
    public Set<SuperMarketTransactionResponseDto> getAllTransactions(){
        return transactionService.findAll();
    }
}
