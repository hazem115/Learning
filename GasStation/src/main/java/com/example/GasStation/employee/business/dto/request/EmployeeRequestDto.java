package com.example.GasStation.employee.business.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeRequestDto {
    private Long id;
    private String refNo = UUID.randomUUID().toString();
    private String name;
    private String position;
    private String phone;
}
