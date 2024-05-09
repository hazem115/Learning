package com.example.talabat.offers.business.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class OffersRequestDto {

    private Long id;
    private String refNo = UUID.randomUUID().toString();
    private String offerName;
    private double offerPercentage;

}
