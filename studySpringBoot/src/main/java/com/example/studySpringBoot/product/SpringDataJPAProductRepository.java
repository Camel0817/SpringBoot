package com.example.studySpringBoot.product;

import org.springframework.data.jpa.repository.JpaRepository;
																	// Entity / id 형태
public interface SpringDataJPAProductRepository extends JpaRepository<Product, Integer> {
	
}
