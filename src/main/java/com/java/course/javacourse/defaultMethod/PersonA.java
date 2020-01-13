package com.java.course.javacourse.defaultMethod;

public interface PersonA {

	public void walk();
	
	default public void speak() {
		System.out.println("I am speaking right now - PersonA");
	}
	
}