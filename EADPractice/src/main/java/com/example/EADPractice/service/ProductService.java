package com.example.EADPractice.service;

import com.example.EADPractice.dto.ProductDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {
    public List<ProductDto> getList();
    public ProductDto getProduct(int id);
    public ProductDto saveProduct(ProductDto empDto);
}
