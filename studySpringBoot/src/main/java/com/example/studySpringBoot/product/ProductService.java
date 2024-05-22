package com.example.studySpringBoot.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
	
	public Product getProduct(int id) {
		return productRepository.getProduct(id);
	}
	
	public void saveProduct(Product product) {
//		productRepository.save(productName);
		productRepository.save(product);
	}
}
