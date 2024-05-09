package com.example.mapstruct.order.business.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class OrdersDto {

    private Long orderId;
    private String orderName;
    private Date orderDate;
    private Long orderQuantity;


}
