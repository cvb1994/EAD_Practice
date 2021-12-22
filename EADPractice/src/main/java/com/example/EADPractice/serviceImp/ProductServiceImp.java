package com.example.EADPractice.serviceImp;

import com.example.EADPractice.dto.ProductDto;
import com.example.EADPractice.entity.Product;
import com.example.EADPractice.mapper.ProductMapper;
import com.example.EADPractice.repository.ProductRepository;
import com.example.EADPractice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class ProductServiceImp implements ProductService {
    @Autowired
    ProductRepository prodRepo;
    @Autowired
    ProductMapper prodMapper;

    @Override
    public List<ProductDto> getList() {
        return prodRepo.findAll().stream().map(prodMapper::entityToDto).collect(Collectors.toList());
    }

    @Override
    public ProductDto getProduct(int id) {
        return prodRepo.findById(id).map(prodMapper::entityToDto).orElse(null);
    }

    @Override
    public ProductDto saveProduct(ProductDto prodDto) {
        Product prod = Optional.ofNullable(prodDto).map(prodMapper::dtoToEntity).orElse(null);
        if(prod != null){
            return Optional.ofNullable(prodRepo.save(prod)).map(prodMapper::entityToDto).orElse(null);
        }
        return null;
    }

}
