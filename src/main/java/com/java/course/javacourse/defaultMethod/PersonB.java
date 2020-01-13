package com.java.course.javacourse.defaultMethod;

public interface PersonB {

	default public void speak() {
		System.out.println("I am speaking right now - PersonB");
	}
	
}
