package com.example.giftcard.giftcard.business.dto;

import com.example.giftcard.giftcard.business.dto.request.GiftCardDtoRequest;
import com.example.giftcard.giftcard.business.dto.response.GiftCardDtoResponse;
import com.example.giftcard.giftcard.presistance.entity.GiftCard;
import org.mapstruct.*;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring",
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS,
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface GiftCardMapper {

    @Mappings({
            @Mapping(source = "price", target = "price"),
            @Mapping(source = "qty", target = "qty"),
            @Mapping(source = "clientPhone", target = "clientPhone"),
            @Mapping(source = "clientName", target = "clientName"),
            @Mapping(source = "forMe", target = "forMe"),
            @Mapping(source = "giftSerial", target = "giftSerial")
    })

    GiftCardDtoResponse entityToResponseDto(GiftCard giftCard);

    @Mappings({
            @Mapping(source = "price", target = "price"),
            @Mapping(source = "qty", target = "qty"),
            @Mapping(source = "clientPhone", target = "clientPhone"),
            @Mapping(source = "clientName", target = "clientName"),
            @Mapping(source = "forMe", target = "forMe")
    })
    GiftCardDtoRequest requestDtoToEntity(GiftCardDtoRequest giftCardDtoRequest);

}
