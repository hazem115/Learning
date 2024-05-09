package com.example.mapstruct.product.business.dto;

import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProductDto {

    private Long productId;
    private String productName;
    private Double productPrice;

}
