package com.example.GasStation.employee.business.service.services;

import com.example.GasStation.employee.business.dto.request.EmployeeRequestDto;
import com.example.GasStation.employee.business.dto.response.EmployeeResponseDto;

import java.util.Set;

public interface EmployeeService {
    EmployeeResponseDto createEmployee(EmployeeRequestDto request);
    EmployeeResponseDto update(String refNo, EmployeeRequestDto request);
    void deleteById(Long id);
    EmployeeResponseDto findById(Long id);
    Set<EmployeeResponseDto> findAll();
    EmployeeResponseDto findByRefNo(String refNo);

}
