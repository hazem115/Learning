package com.example.giftcard.giftcard.business.dto.response;

import com.example.giftcard.client.presistance.entity.Client;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class GiftCardDtoResponse {

    private double price;
    private int qty;
    private String clientPhone;
    private String clientName;
    public boolean forMe = false;
    private String giftSerial = RandomStringUtils.random(8, true, true);

    private Client client;

}