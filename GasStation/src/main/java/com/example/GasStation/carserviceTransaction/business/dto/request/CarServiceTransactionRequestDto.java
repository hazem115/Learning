package com.example.GasStation.carserviceTransaction.business.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CarServiceTransactionRequestDto {
    private Long id;
    private String refNo = UUID.randomUUID().toString();
    private Long customerId;
    private Long empId;
    private Double totalCost;
    private String serviceType;
    private String paymentMethod;
}
