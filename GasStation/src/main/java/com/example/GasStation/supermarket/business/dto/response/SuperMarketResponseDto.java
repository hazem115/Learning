package com.example.GasStation.supermarket.business.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SuperMarketResponseDto {
    private String refNo = UUID.randomUUID().toString();
    private String name;
    private double price;
    private int qty;
}
