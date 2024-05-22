package com.example.studySpringBoot;

public class OverrideDemo {
	void test() {
		Child child = new Child();
		child.method();
	}
}

/* 
 * 어노테이션의 중요성
 */

class Parent {
	void method() {
		
	}
}

class Child extends Parent{
	
	@Override
	void method() {
		
	}
}

