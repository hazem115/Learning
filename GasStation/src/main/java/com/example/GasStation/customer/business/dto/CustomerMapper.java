package com.example.GasStation.customer.business.dto;

import com.example.GasStation.customer.business.dto.request.CustomerRequestDto;
import com.example.GasStation.customer.business.dto.response.CustomerResponseDto;
import com.example.GasStation.customer.presistance.entity.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
@Mapper(componentModel = "spring",
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS,
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface CustomerMapper {
    CustomerResponseDto entityToDto(Customer customer);
    Set<CustomerResponseDto> entityToDto(Set<Customer> customer);
    Customer dtoToEntity(CustomerRequestDto request);
    Set<Customer> dtoToEntity(Set<CustomerRequestDto> request);
}
