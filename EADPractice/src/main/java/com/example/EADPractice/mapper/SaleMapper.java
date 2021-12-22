package com.example.EADPractice.mapper;

import com.example.EADPractice.dto.ProductDto;
import com.example.EADPractice.dto.SaleDto;
import com.example.EADPractice.entity.Product;
import com.example.EADPractice.entity.Sale;
import org.mapstruct.*;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE,  uses = {ProductMapper.class})
@Named("SaleMapper")
public interface SaleMapper {
//    @Named("toDtoWithoutChildren")
//    @Mappings({
//            @Mapping(target = "prodId", qualifiedByName = {"ProductMapper", "toDtoWithoutSale"})})//ignore = true
    SaleDto entityToDto(Sale sale);
    Sale dtoToEntity(SaleDto saleDto);

    ProductDto productToProductDto(Product product);
}
