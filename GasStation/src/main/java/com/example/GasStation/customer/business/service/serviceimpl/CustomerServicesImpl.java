package com.example.GasStation.customer.business.service.serviceimpl;

import com.example.GasStation.customer.business.dto.CustomerMapper;
import com.example.GasStation.customer.business.dto.request.CustomerRequestDto;
import com.example.GasStation.customer.business.dto.response.CustomerResponseDto;
import com.example.GasStation.customer.business.service.services.CustomerServices;
import com.example.GasStation.customer.presistance.entity.Customer;
import com.example.GasStation.customer.presistance.repo.CustomerRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class CustomerServicesImpl implements CustomerServices {
    private final CustomerMapper customerMapper;
    private final CustomerRepo customerRepo;

    @Override
    public CustomerResponseDto createCustomer(CustomerRequestDto request) {
        Customer customer = customerRepo.save(customerMapper.dtoToEntity(request));

        return customerMapper.entityToDto(customer);
    }
    @Override
    public CustomerResponseDto update(String refNo, CustomerRequestDto request) {
        Customer oldCustomer = customerRepo.findByRefNo(refNo);
        Customer customerToUpdate = customerMapper.dtoToEntity(request);
        customerToUpdate.setId(oldCustomer.getId());
        return customerMapper.entityToDto(customerRepo.save(customerToUpdate));
    }
    @Override
    public void deleteById(Long id) {
        customerRepo.deleteById(id);
    }
    @Override
    public CustomerResponseDto getCustomerByRefNo(String refNo) {
        Customer customer = customerRepo.findByRefNo(refNo);
        return customerMapper.entityToDto(customer);
    }
    @Override
    public CustomerResponseDto getCustomerById(Long id) {
        Customer customer = customerRepo.findById(id).orElse(null);
        return customerMapper.entityToDto(customer);
    }
    @Override
    public Set<CustomerResponseDto> getAllCustomers() {
        List<Customer> customers = customerRepo.findAll();
        return customerMapper.entityToDto(new HashSet<>(customers));
    }
}
