package com.example.giftcard.client.business.dto;

import com.example.giftcard.client.presistance.entity.Client;
import org.mapstruct.*;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring",
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS,
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface ClientMapper {

    @Mappings({
            @Mapping(source = "id", target = "facilityId"),
            @Mapping(source = "refNo", target = "facilityRefNo"),
            @Mapping(source = "name", target = "facilityName")
    })
    ClientDto toEntity(Client client);

    @InheritInverseConfiguration
    Client toDto(ClientDto clientDto);
}
