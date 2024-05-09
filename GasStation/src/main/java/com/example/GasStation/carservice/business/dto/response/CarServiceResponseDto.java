package com.example.GasStation.carservice.business.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CarServiceResponseDto {

    private String refNo = UUID.randomUUID().toString();
    private Long customerId;
    private Long employeeId;
    private Date date;
    private String serviceType;
    private double totalCost;
    private String paymentMethod;
}
