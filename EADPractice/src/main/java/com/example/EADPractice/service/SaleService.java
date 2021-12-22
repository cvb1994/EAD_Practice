package com.example.EADPractice.service;

import com.example.EADPractice.dto.SaleDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SaleService {
    List<SaleDto> getList();
}
