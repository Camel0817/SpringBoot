package com.example.studySpringBoot.product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DataSourceUtils;

import jakarta.persistence.EntityManager;

// 해아할 일
// DB에 Product를 저장할 공간, 테이블... 준비
// 1) DB랑 연결
// 2) Product 저장, 조회...


//	- @Component가 들어있는 건 당연
//	- DB랑 연결할 때 기본적으로 필요할 것 같은 예외 처리 제공
//@Repository
public class ProductRepository {
	
	private Map<Integer, Product> dataBase = new HashMap<>();
	private int id = 1;
	
	@Autowired
	EntityManager entityManager;
	
//	@Autowired
//	DataSource dataSource;
//	
//	// dataSource로 터널 뚫어보기 (=DB와 커넥션 만들기)
//	public void makeConnection() {
//		DataSourceUtils.getConnection(dataSource);
//	}
	
	
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
