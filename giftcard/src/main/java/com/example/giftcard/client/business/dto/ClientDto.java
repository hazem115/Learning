package com.example.giftcard.client.business.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ClientDto {

    private Long facilityId;
    private String facilityName;
    private String facilityRefNo = UUID.randomUUID().toString();

}
