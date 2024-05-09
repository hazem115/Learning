package com.example.GasStation.employee.business.dto;

import com.example.GasStation.employee.business.dto.request.EmployeeRequestDto;
import com.example.GasStation.employee.business.dto.response.EmployeeResponseDto;
import com.example.GasStation.employee.presistance.entity.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
@Mapper(componentModel = "spring",
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS,
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface EmployeeMapper {
    EmployeeResponseDto entityToDto(Employee employee);
    Set<EmployeeResponseDto> entityToDto(Set<Employee> employee);
    Employee dtoToEntity(EmployeeRequestDto request);
    Set<Employee> dtoToEntity(Set<EmployeeRequestDto> request);
}
