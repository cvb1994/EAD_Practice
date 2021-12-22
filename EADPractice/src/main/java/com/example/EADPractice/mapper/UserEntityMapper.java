package com.example.EADPractice.mapper;

import com.example.EADPractice.dto.RoleDto;
import com.example.EADPractice.dto.UserEntityDto;
import com.example.EADPractice.entity.Role;
import com.example.EADPractice.entity.UserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Named;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
@Named("UserMapper")
public interface UserEntityMapper {
    UserEntityDto entityToDto(UserEntity user);
    UserEntity dtoToEntity(UserEntityDto userDto);

    RoleDto roleToRoleDto(Role role);
}
