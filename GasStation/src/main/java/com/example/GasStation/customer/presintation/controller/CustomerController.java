package com.example.GasStation.customer.presintation.controller;

import com.example.GasStation.customer.business.dto.request.CustomerRequestDto;
import com.example.GasStation.customer.business.dto.response.CustomerResponseDto;
import com.example.GasStation.customer.business.service.services.CustomerServices;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/customers")
public class CustomerController {
    private final CustomerServices customerService;
    @PostMapping("/createCustomer")
    public CustomerResponseDto createCustomer(@RequestBody CustomerRequestDto request){
        return customerService.createCustomer(request);
    }
    @PutMapping("/updateCustomer/{refNo}")
    public CustomerResponseDto updateCustomer(@PathVariable String refNo,@RequestBody CustomerRequestDto request){
        return customerService.update(refNo, request);
    }
    @DeleteMapping("/deleteCustomer/{id}")
    public void deleteCustomerById(@PathVariable Long id){
        customerService.deleteById(id);
    }
    @GetMapping("/getCustomer/{id}")
    public CustomerResponseDto getCustomer(@PathVariable Long id){
        return customerService.getCustomerById(id);
    }
    @GetMapping("/getCustomerByRefNo/{refNo}")
    public CustomerResponseDto getCustomerByRefNo(@PathVariable String refNo){
        return customerService.getCustomerByRefNo(refNo);
    }
    @GetMapping("/getAllCustomers")
    public Set<CustomerResponseDto> getAllCustomers(){
        return customerService.getAllCustomers();
    }
}
