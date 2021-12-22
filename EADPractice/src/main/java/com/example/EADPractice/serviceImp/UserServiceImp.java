package com.example.EADPractice.serviceImp;

import com.example.EADPractice.dto.UserEntityDto;
import com.example.EADPractice.entity.UserEntity;
import com.example.EADPractice.mapper.UserEntityMapper;
import com.example.EADPractice.repository.UserRepository;
import com.example.EADPractice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Component
public class UserServiceImp implements UserService {

    @Autowired
    UserRepository userRepo;

    @Autowired
    UserEntityMapper userMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<UserEntity> us = userRepo.findByUsername(username);
        UserEntityDto user = us.map(userMapper::entityToDto).orElse(null);
        if (user == null) {
            throw new UsernameNotFoundException("Username Not Found");
        }
        Set<GrantedAuthority> roles = new HashSet<>();
        roles.add(new SimpleGrantedAuthority(user.getRole().getName()));

        return new User(username, user.getPassword(), roles);
    }
}
