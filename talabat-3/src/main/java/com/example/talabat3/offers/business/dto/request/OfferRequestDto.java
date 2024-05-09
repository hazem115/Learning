package com.example.talabat3.offers.business.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OfferRequestDto {

    private String title;
    private String description;
    private double price;
}
