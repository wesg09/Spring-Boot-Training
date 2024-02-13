package com.springboot.LearnJPACourses.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.springboot.LearnJPACourses.dto.ProductDTO;
import com.springboot.LearnJPACourses.entity.Product;

public class ProductMapperImpl implements ProductMapper {

	@Autowired
	private ModelMapper modelMapper;

	@Override
	public ProductDTO entityToDto(Product product) {

		ProductDTO productDto = this.modelMapper.map(product, ProductDTO.class);
		return productDto;

		//		ProductDTO productDto = new ProductDTO();
		//		productDto.setId(product.getId());
		//		productDto.setName(product.getName());
		//		productDto.setDesc(product.getDesc());
		//		productDto.setQuantity(product.getQuantity());
		//		productDto.setPrice(product.getPrice());
		//		return productDto;
	}

	@Override
	public Product dtoTOEntity(ProductDTO productDto) {

		Product product = this.modelMapper.map(productDto, Product.class);
		return product;
		//		Product product = new Product();
		//		product.setId(productDto.getId());
		//		product.setName(productDto.getName());
		//		product.setDesc(productDto.getDesc());
		//		product.setQuantity(productDto.getQuantity());
		//		product.setPrice(productDto.getPrice());
		//		return product;
	}
}
