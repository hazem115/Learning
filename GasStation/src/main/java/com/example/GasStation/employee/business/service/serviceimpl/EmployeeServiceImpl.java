package com.example.GasStation.employee.business.service.serviceimpl;

import com.example.GasStation.employee.business.dto.EmployeeMapper;
import com.example.GasStation.employee.business.dto.request.EmployeeRequestDto;
import com.example.GasStation.employee.business.dto.response.EmployeeResponseDto;
import com.example.GasStation.employee.business.service.services.EmployeeService;
import com.example.GasStation.employee.presistance.entity.Employee;
import com.example.GasStation.employee.presistance.repo.EmployeeRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepo employeeRepo;
    private final EmployeeMapper employeeMapper;
    @Override
    public EmployeeResponseDto createEmployee(EmployeeRequestDto request) {
        Employee employee = employeeRepo.save(employeeMapper.dtoToEntity(request));
        return employeeMapper.entityToDto(employee);
    }

    @Override
    public EmployeeResponseDto update(String refNo, EmployeeRequestDto request) {
        Employee oldEmployee = employeeRepo.getByRefNo(refNo);
        Employee employeeToUpdate = employeeMapper.dtoToEntity(request);
        employeeToUpdate.setId(oldEmployee.getId());
        return employeeMapper.entityToDto(employeeRepo.save(employeeToUpdate));
    }

    @Override
    public void deleteById(Long id) {
        employeeRepo.deleteById(id);
    }

    @Override
    public EmployeeResponseDto findById(Long id) {
        Employee employee = employeeRepo.findById(id).orElse(null);
        return employeeMapper.entityToDto(employee);
    }

    @Override
    public Set<EmployeeResponseDto> findAll() {
        List<Employee> employees = employeeRepo.findAll();
        return employeeMapper.entityToDto(new HashSet<>(employees));
    }

    @Override
    public EmployeeResponseDto findByRefNo(String refNo) {
        Employee employee = employeeRepo.getByRefNo(refNo);
        return employeeMapper.entityToDto(employee);
    }
}
