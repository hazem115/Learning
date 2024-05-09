package com.example.mapstruct.order.business.dto;

import com.example.mapstruct.order.presistance.entity.Orders;
import org.mapstruct.*;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring",
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS ,
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface OrdersMapper {
    @Mappings({
            @Mapping(source = "id", target = "orderId"),
            @Mapping(source = "name", target = "orderName"),
            @Mapping(source = "date", target = "orderDate"),
            @Mapping(source = "quantity", target = "orderQuantity")
    })
    OrdersDto entityToDto (Orders orders);
    @InheritInverseConfiguration
    Orders dtoToEntity (OrdersDto ordersDto);

}
