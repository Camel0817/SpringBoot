package com.example.studySpringBoot.product;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class ProductRepository {
	
	private Map<Integer, String> dataBase = new HashMap<>();
	private int id = 1;
	
	public String getProduct(int idx) {
		return dataBase.get(idx);
	}
	
	public void save(Product product) {
		System.out.println(product.getName());
//		dataBase.put(id++, productName);
	}
}
