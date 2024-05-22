package com.example.studySpringBoot.product;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class ProductController {
	/*
	 * "사용자(화면) 요청을 던지면" 그걸 받아서
	 * 요청에 맞는 메소드를 실행 시킵니다.
	 * 그 안에서, 그에 맞는 로직을 수행할 수 있도록 서비스한테 시킬거에요.
	 */
	
	/*
	 * HTTP method 
	 * 1. 조회 : GET 
	 * 2. 등록(생성) : POST 
	 * 3. 수정 : 전체 - PUT 부분 - PATCH 
	 * 4. 삭제 : DELETE
	 */
	
	/* 
	 * 상품조회
	 */
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String getProduct() {
		ProductService productService = new ProductService();
		return productService.getProduct();
	}
}
