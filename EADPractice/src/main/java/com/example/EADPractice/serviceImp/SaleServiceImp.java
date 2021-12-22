package com.example.EADPractice.serviceImp;

import com.example.EADPractice.dto.SaleDto;
import com.example.EADPractice.mapper.SaleMapper;
import com.example.EADPractice.repository.SaleRepository;
import com.example.EADPractice.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class SaleServiceImp implements SaleService {
    @Autowired
    private SaleRepository saleRepo;

    @Autowired
    private SaleMapper saleMapper;
    @Override
    public List<SaleDto> getList() {
        return saleRepo.findAll().stream().map(saleMapper::entityToDto).collect(Collectors.toList());
    }
}
