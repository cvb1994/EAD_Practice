package com.example.EADPractice.dto;

import com.example.EADPractice.entity.Product;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SaleDto {
    private int slNo;
    private String salemanId;
    private String salemanName;
    private String dos;
    private Product product;
}
