package com.example.EADPractice.mapper;

import com.example.EADPractice.dto.EmployeeDto;
import com.example.EADPractice.entity.Employee;
import org.mapstruct.*;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
@Named("EmployeeMapper")
public interface EmployeeMapper {
    EmployeeDto entityToDto(Employee emp);
    Employee dtoToEntity(EmployeeDto empDto);
}
