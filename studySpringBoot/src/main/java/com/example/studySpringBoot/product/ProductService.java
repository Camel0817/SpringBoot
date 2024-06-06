package com.example.studySpringBoot.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
public class ProductService {
	/*
	 * 스프링 빈으로 등록해줘! 
	 * 1. @Component 
	 * 2. @Configuration + @Bean
	 * 
	 * 등록된 빈을 사용해줘!
	 * 1. @Autowired
	 */
	
	/*
	 * DI(의존성 주입)의 3가지 방법
	 * 1. 필드 주입 
	 * 		@Autowired
	 * 		:필드 마련
	 * 
	 * 2. Setter 주입
	 * 		@Autowired
	 * 		: setter 메서드 => 요즘 안쓰임 public으로 열려있기때문에 언제든지 접근 가능
	 * 
	 * 3. 생성자 주입
	 * 		@Autowired
	 * 		: 생성자
	 */
	
	private ProductRepository productRepository;
	
	@Autowired
	ProductService(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}
	
//	public void makeConnection() {
//		productRepository.makeConnection();
//	}
	
	public Product getProduct(int id) {
		return productRepository.getProduct(id);
	}
	
	/*
	 * Transaction
	 * 	데이터베이스 작업 단위
	 * 	Q. 회원가입 : 입력값 가입 요청 -> 가입 -> 000님 환영합니다!(가입 정보 출력)
	 * 							Create ->    Read
	 * 1) create / read 트랜잭션 2개 => X
	 * 2) 사용자가 원하는 기능 덩어리 단위 = 'Create ~ Read' 트랜잭션 1개
	 * 		= 비즈니스 로직
	 * Repository의 메소드 단위 : CRUD 단위
	 * Service의 메소드 단위 : 비즈니스 로직 단위 => Transaction
	 * 
	 * 하나의 트랜잭션 : insert + insert + insert + insert + insert
	 * 		- 작업 도중 에러 발생! 에러 나기 전 성공한 것들까지 포함해서, 그냥 다시 다~ 원상태로 복귀!
	 * 			= 모든 작업 다 롤백(Roll-Back, 원 상태로 복귀)
	 * 		- 모든 작업들이 성공 => 모두 다 DB 반영
	 * 			"트랜잭션 단위로 DB에 반영/취소
	 */
	
	@Transactional
	public void saveProduct(Product product) {
//		productRepository.save(productName);
		productRepository.save(product);
	}

	public List<Product> getProducts() {
		return productRepository.getProducts();
	}
}
