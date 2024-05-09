package com.example.Hahhahaahah.hazem.business.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HazemRequestDto {
    private Long id;
    private String name;
    private String email;
    private String password;
    private String phone;
    private String address;
    private String city;
    private String state;
    private String country;
    private String zipcode;
    private String image;
}
