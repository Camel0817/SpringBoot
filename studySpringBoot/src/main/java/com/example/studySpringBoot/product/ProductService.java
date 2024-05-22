package com.example.studySpringBoot.product;

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
	
	public String getProduct() {
		return "NoteBook!!";
	}
}
