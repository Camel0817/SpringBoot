package com.example.studySpringBoot.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/*
 * "사용자(화면) 요청을 던지면" 그걸 받아서
 * 요청에 맞는 메소드를 실행 시킵니다.
 * 그 안에서, 그에 맞는 로직을 수행할 수 있도록 서비스한테 시킬거에요.
 */

@Controller
@ResponseBody
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	/*
	 * HTTP method 
	 * 1. 조회 : GET 
	 * 2. 등록(생성) : POST 
	 * 3. 수정 : 전체 - PUT 
	 * 			부분 - PATCH 
	 * 4. 삭제 : DELETE
	 */
	
	/* 
	 * 상품 조회
	 */
	@RequestMapping(value = "/products/{id}", method = RequestMethod.GET)
	public String getProduct(@PathVariable("id") int id) {
		// ProductService productService = new ProductService();
		System.out.println(id);
		return productService.getProduct(id);
	}
	
	/*
	 * 요청을 받을 때 데이터도 같이 받는 방법
	 * 1. HttpServletRequest
	 * 2. @RequestParam
	 * 		http://localhost:8080/products?name=_____
	 * 3. @RequestBody
	 * 4. @ModelAtrribute
	 * 5. @PathVariable
	 * 		http://localhost:8080/products/{id}
	 */
	
	/* 
	 * 상품 등록
	 */
	@RequestMapping(value = "/products", method = RequestMethod.POST)
	public void saveProduct(@RequestParam(value = "name") String productName) {
		// localhost:8080/products?name=______ => productName
		System.out.println("POST!");
		productService.saveProduct(productName);
	}
}
