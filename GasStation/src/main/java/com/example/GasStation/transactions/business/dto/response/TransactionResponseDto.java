package com.example.GasStation.transactions.business.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TransactionResponseDto {
    private String refNo = UUID.randomUUID().toString();
    private Long empId;
    private Long pumpId;
    private String fuelType;
    private Double totalCost;
    private String paymentMethod;
}
