package com.example.GasStation.transactions.business.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TransactionRequestDto {
    private Long id;
    private String refNo = UUID.randomUUID().toString();
    private Long empId;
    private Long pumpId;
    private String fuelType;
    private Double totalCost;
    private String paymentMethod;
}
