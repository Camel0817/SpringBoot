package com.example.studySpringBoot.product;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

// JPA한테 Entity로 등록해줘
// @Entity
@Entity
public class Product {
	
	// DB에서.. id가 식별자인데..?
	// 이곳은 자바 코드! hibernate(EntityManager,...JPA 구현체)
	// EntityContext 안에서 자기 나름의 identifier(식별자 = DB의 PK)를 가지고 Entity를 구별
	@Id
	private int id;
	private String name;
	private int price;
	private String description;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

}
