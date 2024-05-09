package com.example.giftcard.facility.business.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class FacilityDto {

    private Long facilityId;
    private String facilityRefNo = UUID.randomUUID().toString();
    private String facilityName;
}
