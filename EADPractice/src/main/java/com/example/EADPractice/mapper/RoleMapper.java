package com.example.EADPractice.mapper;

import com.example.EADPractice.dto.RoleDto;
import com.example.EADPractice.entity.Role;
import org.mapstruct.Mapper;
import org.mapstruct.Named;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
@Named("RoleMapper")
public interface RoleMapper {
    RoleDto entityToDto(Role role);
    Role dtoToEntity(RoleDto roleDto);
}
