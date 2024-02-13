package com.springboot.LearnJPACourses.mapper;

import com.springboot.LearnJPACourses.dto.ProductDTO;
import com.springboot.LearnJPACourses.entity.Product;

public interface ProductMapper {

	ProductDTO entityToDto(Product product);

	Product dtoTOEntity(ProductDTO productDto);

}
