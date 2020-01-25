package com.java.course.javacourse.optional;

import java.util.Optional;

public class OptionalApp {
	
	public void probar(String valor) {
		//System.out.println(valor.contains("marco"));
		
		try {

			Optional op = Optional.empty();
			op.get();
		} catch (Exception e) {
			System.out.println("No hay elemento");
		}
	
	}
	
	public void orElse(String value) {
		Optional<String> op = Optional.ofNullable(value);
		String val = op.orElse("default value");
		System.out.println("the value is: " + val);
	}
	
	public void orElseThrow(String value) {
		Optional<String> op = Optional.ofNullable(value);
		String val = op.orElseThrow(NumberFormatException::new);
		System.out.println(val);
		
	}
	
	public void isPresent(String value) {
		Optional<String> op = Optional.ofNullable(value);
		System.out.println(op.isPresent());
	}

	public static void main(String[] args) {
		
		OptionalApp app = new OptionalApp();
//		app.probar("ju");
//		app.orElse("Culture");
//		app.orElseThrow("Pedro");
		app.isPresent("Bernardo");
	}

}
