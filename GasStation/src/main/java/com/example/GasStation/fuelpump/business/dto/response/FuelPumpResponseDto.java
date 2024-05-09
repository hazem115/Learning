package com.example.GasStation.fuelpump.business.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FuelPumpResponseDto {

    private String refNo = UUID.randomUUID().toString();
    private Long empId;
    private String fuelType;
    private double capacity;
}
