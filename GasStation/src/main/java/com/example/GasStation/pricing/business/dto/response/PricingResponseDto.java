package com.example.GasStation.pricing.business.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PricingResponseDto {

    private String refNo = UUID.randomUUID().toString();
    private String fuelType;
    private Double pricePerGallon;
}
