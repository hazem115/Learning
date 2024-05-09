package com.example.talabat2.offers.business.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OfferRequestDto {
    private Long id;
    private String refNo = UUID.randomUUID().toString();
    private String title;
    private double value;
}
