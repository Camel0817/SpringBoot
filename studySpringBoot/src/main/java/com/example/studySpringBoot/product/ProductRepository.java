package com.example.studySpringBoot.product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class ProductRepository {
	
	private Map<Integer, Product> dataBase = new HashMap<>();
	private int id = 1;
	
	public Product getProduct(int idx) {
		return dataBase.get(idx);
	}
	
	public void save(Product product) {
		System.out.println(product.getName());
		dataBase.put(id++, product);
	}

	public List<Product> getProducts() {
		return new ArrayList<>(dataBase.values());
	}
}
