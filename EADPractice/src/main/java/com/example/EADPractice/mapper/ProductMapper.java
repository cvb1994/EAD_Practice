package com.example.EADPractice.mapper;

import com.example.EADPractice.dto.ProductDto;
import com.example.EADPractice.dto.SaleDto;
import com.example.EADPractice.entity.Product;
import com.example.EADPractice.entity.Sale;
import org.mapstruct.*;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
@Named("ProductMapper")
public interface ProductMapper {
//    @Named("toDtoWithoutSale")
//    @Mappings({ @Mapping(target = "sales", expression = "java(null)")})
    ProductDto entityToDto(Product emp);
    Product dtoToEntity(ProductDto empDto);

    SaleDto saleToSaleDto(Sale sale);
}
