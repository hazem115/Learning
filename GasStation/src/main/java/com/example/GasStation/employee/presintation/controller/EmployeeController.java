package com.example.GasStation.employee.presintation.controller;

import com.example.GasStation.employee.business.dto.request.EmployeeRequestDto;
import com.example.GasStation.employee.business.dto.response.EmployeeResponseDto;
import com.example.GasStation.employee.business.service.services.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/api/v1/employees")
@RequiredArgsConstructor
public class EmployeeController {
    private final EmployeeService employeeService;
    @PostMapping("/saveEmp")
    public EmployeeResponseDto saveEmp(@RequestBody EmployeeRequestDto request) {
        return employeeService.createEmployee(request);
    }
    @PutMapping("/updateEmp/{refNo}")
    public EmployeeResponseDto updateEmp(@PathVariable String refNo, @RequestBody EmployeeRequestDto request) {
        return employeeService.update(refNo, request);
    }
    @DeleteMapping("/deleteEmp/{id}")
    public void deleteEmp(@PathVariable Long id) {
        employeeService.deleteById(id);
    }
    @GetMapping("/getEmpById/{id}")
    public EmployeeResponseDto getEmp(@PathVariable Long id) {
        return employeeService.findById(id);
    }
    @GetMapping("/getEmpByRefNo/{refNo}")
    public EmployeeResponseDto getEmpByRefNo(@PathVariable String refNo) {
        return employeeService.findByRefNo(refNo);
    }
    @GetMapping("/getAllEmp")
    public Set<EmployeeResponseDto> getAllEmp() {
        return employeeService.findAll();
    }
}
