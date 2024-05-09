package com.example.giftcard.giftcard.business.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;
@NoArgsConstructor
@AllArgsConstructor
@Data
public class GiftCardDtoRequest {

    private double price;
    private int qty;
    private String clientPhone;
    private String clientName;
    public boolean forMe = false;

}
