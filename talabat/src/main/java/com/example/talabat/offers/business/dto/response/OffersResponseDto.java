package com.example.talabat.offers.business.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OffersResponseDto{

    private String refNo = UUID.randomUUID().toString();
    private String offerName;
    private double offerPercentage;
}
