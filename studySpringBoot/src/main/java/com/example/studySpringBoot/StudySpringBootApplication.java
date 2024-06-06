package com.example.studySpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudySpringBootApplication {
//	Spring은 자바로 웹을 만들수 있는 프레임워크
//	웹 : 정보 공유 -> *DATA*
//	Spring은 우리가 JPA를 더 편하게 쓸 수 있게 도와주고 싶다.
//	=> "Spring Data JPA"
	public static void main(String[] args) {
		SpringApplication.run(StudySpringBootApplication.class, args);
	}

}
