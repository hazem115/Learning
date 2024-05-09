package com.example.GasStation.customer.business.service.services;

import com.example.GasStation.customer.business.dto.request.CustomerRequestDto;
import com.example.GasStation.customer.business.dto.response.CustomerResponseDto;

import java.util.Set;

public interface CustomerServices {
    CustomerResponseDto createCustomer(CustomerRequestDto request);
    CustomerResponseDto update(String refNo, CustomerRequestDto request);
    void deleteById(Long id);
    CustomerResponseDto getCustomerByRefNo(String refNo);
    CustomerResponseDto getCustomerById(Long id);
    Set<CustomerResponseDto> getAllCustomers();
}
