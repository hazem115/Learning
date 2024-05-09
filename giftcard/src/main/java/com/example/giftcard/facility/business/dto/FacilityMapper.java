package com.example.giftcard.facility.business.dto;

import com.example.giftcard.facility.presistance.entity.Facility;
import org.mapstruct.*;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring",
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS,
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface FacilityMapper {

    @Mappings({
            @Mapping(source = "id", target = "facilityId"),
            @Mapping(source = "refNo", target = "facilityRefNo"),
            @Mapping(source = "name", target = "facilityName")
    })
    FacilityDto toEntity (Facility facility);

    @InheritInverseConfiguration
    Facility toDto (FacilityDto facilityDto);
}
