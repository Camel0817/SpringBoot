package com.example.studySpringBoot.product;

import org.springframework.stereotype.Service;

@Service
public class ProductService {
	
	public String getProduct() {
		return "NoteBook!";
	}
}
