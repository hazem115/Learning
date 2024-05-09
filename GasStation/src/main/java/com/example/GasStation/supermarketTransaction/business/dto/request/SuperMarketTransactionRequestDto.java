package com.example.GasStation.supermarketTransaction.business.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SuperMarketTransactionRequestDto {
    private Long id;
    private String refNo = UUID.randomUUID().toString();
    private Long customerId;
    private Long empId;
    private Double totalCost;
    private String paymentMethod;
}
