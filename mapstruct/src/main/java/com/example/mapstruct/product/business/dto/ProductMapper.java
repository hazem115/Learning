package com.example.mapstruct.product.business.dto;

import com.example.mapstruct.product.presistance.entity.Product;
import org.mapstruct.*;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring",
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS,
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
        uses={Product.class})
public interface ProductMapper {

    @Mappings({
            @Mapping(source = "id", target = "productId"),
            @Mapping(source = "name", target = "productName"),
            @Mapping(source = "price", target = "productPrice")
    })
    ProductDto entityToDto(Product product);

    @InheritInverseConfiguration
    Product dtoToEntity(ProductDto productDto);
}
