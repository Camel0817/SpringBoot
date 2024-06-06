package com.example.studySpringBoot.product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DataSourceUtils;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

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
	private EntityManager entityManager;
	
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
//		System.out.println(product.getName());
//		dataBase.put(id++, product);
		
		entityManager.persist(product);
	}

	public List<Product> getProducts() {
		/*
		 * JPQL : SELECT p from Product(Entity 명) (AS) p
		 * 	- Java Persistence Query Language = JPA에서 내가 원하는 쿼리 만들어서 쓸 때 사용하는 명령어
		 * 	- SQL을 자바의 시선으로 한 겹 싼 명령어
		 * 		=> DB에서는 SQL이 실행될 것!
		 */
		 TypedQuery<Product> query = entityManager // 엔티티매니저야
				.createQuery("SELECT p FROM Product p",Product.class); // 이 JPQL 만들어서
		 List<Product> products = query.getResultList(); // 결과좀 가져다줘 
		 return products;
	}
}
