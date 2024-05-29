package com.example.studySpringBoot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.studySpringBoot.product.ProductRepository;

//@Configuration : 클래스 상단
//의미: 이거 원래 설정파일인데(.xml).. JAVA로 썼어
//	.xml(Extensible Markup Language) 란..?
//		=> 	데이터의 의미, 전송을 위해 
//			<태그></태그> 사이에 있는 글자가 어떤 구성을 나타내는지 표현하기 위해 사용하는 언어
//				- 네트워크로 데이터 전송할 때, 서로 다른 시스템끼리 데이터를 잘 알아보게 하기 위해
//				- 특정 시스템 안에서 데이터의 의미를 나타내는 *설정 파일*
//				- ...
//스프링(부트) 프로젝트 안에서.. 데이터의 의미를... 나타낼 게.. 있나..?
//=> 스프링아, 이 클래스는 너가 스프링 빈으로 등록해야 해!
//	XML 버전 : <bean> Product 클래스 </bean> => ps. 아직 많이들 사용..! but, Legacy하다.
//	Java 버전 : 

@Configuration // 여기에도 @Component가 있음
public class AppConfig {
	@Bean // 스프링아, 아래 메소드가 반환하는 객체를 스프링 빈으로 등록해줘
	public ProductRepository productRepository() {
		return new ProductRepository();
	}
}
