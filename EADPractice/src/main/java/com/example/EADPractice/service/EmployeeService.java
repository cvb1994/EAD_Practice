package com.example.EADPractice.service;

import com.example.EADPractice.dto.EmployeeDto;
import com.example.EADPractice.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {
    public List<EmployeeDto> getList();
    public EmployeeDto getEmployee(int id);
    public EmployeeDto saveEmployee(EmployeeDto empDto);
    public EmployeeDto deleteEmployee(int id);
}
