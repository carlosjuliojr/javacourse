package com.java.course.javacourse.defaultMethod;

public class DefaultMethod implements PersonA, PersonB {

	@Override
	public void walk() {
		System.out.println("Hello World");
		
	}
	
	@Override
	public void speak() {
		// TODO Auto-generated method stub
		//PersonB.super.speak();
		System.out.println("Hello I override the default method");
	}

	public static void main(String[] args) {
		// TODO Auto-generap
		DefaultMethod app = new DefaultMethod();
		app.walk();
		app.speak();
	}

}
