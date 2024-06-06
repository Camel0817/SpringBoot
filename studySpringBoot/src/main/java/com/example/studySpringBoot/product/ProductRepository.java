package com.example.studySpringBoot.product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

// 해아할 일
// DB에 Product를 저장할 공간, 테이블... 준비
// 1) DB랑 연결
// 2) Product 저장, 조회...

@Repository
//	- @Component가 들어있는 건 당연
//	- DB랑 연결할 때 기본적으로 필요할 것 같은 예외 처리 제공
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
