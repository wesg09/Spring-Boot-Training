package com.springboot.LearnJPACourses.dto;

import jakarta.persistence.Id;
import lombok.Data;

@Data
public class ProductDTO {
	@Id
	private long id;
	private String name;
	private String desc;
	private int quantity;
	private long price;

}
