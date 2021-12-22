package com.example.EADPractice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductDto {
    private int prodId;
    private String prodName;
    private String description;
    private String dateOfManf;
    private int price;
    private List<SaleDto> sales;
}
