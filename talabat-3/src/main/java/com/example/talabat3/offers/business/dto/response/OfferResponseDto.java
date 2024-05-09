package com.example.talabat3.offers.business.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OfferResponseDto {
    private String refNo = UUID.randomUUID().toString();
    private String title;
    private String description;
    private double price;
}
