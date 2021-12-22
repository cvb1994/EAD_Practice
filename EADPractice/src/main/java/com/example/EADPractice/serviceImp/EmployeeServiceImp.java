package com.example.EADPractice.serviceImp;

import com.example.EADPractice.dto.EmployeeDto;
import com.example.EADPractice.entity.Employee;
import com.example.EADPractice.mapper.EmployeeMapper;
import com.example.EADPractice.repository.EmployeeRepository;
import com.example.EADPractice.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class EmployeeServiceImp implements EmployeeService {
    @Autowired
    EmployeeRepository empRepo;
    @Autowired
    EmployeeMapper empMapper;

    @Override
    public List<EmployeeDto> getList() {
        return empRepo.findAll().stream().map(empMapper::entityToDto).collect(Collectors.toList());
    }

    @Override
    public EmployeeDto getEmployee(int id) {
        return empRepo.findById(id).map(empMapper::entityToDto).orElse(null);
    }

    @Override
    public EmployeeDto saveEmployee(EmployeeDto empDto) {
        Employee emp = Optional.ofNullable(empDto).map(empMapper::dtoToEntity).orElse(null);
        if(emp != null){
            return Optional.ofNullable(empRepo.save(emp)).map(empMapper::entityToDto).orElse(null);
        }
        return null;
    }

    @Override
    public EmployeeDto deleteEmployee(int id) {
        return null;
    }
}
