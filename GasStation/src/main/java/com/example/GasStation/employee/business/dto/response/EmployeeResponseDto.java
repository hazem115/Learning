package com.example.GasStation.employee.business.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeResponseDto {

    private String refNo = UUID.randomUUID().toString();
    private String name;
    private String position;
    private String phone;
}
