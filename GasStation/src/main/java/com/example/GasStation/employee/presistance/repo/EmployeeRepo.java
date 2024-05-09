package com.example.GasStation.employee.presistance.repo;

import com.example.GasStation.employee.presistance.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository <Employee , Long> {
    Employee getByRefNo(String refNo);
}
