package com.java.course.javacourse.anotations;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class App {
	
	//Anotations of repeticion is ligate of api reflection in java,  is used in run time excecution
	
	@Retention(RetentionPolicy.RUNTIME)
	public @interface Lenguajes{
		Lenguaje[] value() default {};
	}
	
	@Repeatable(value = Lenguajes.class)
	public @interface Lenguaje{
		String value();
	}
	
	//	1.7
	/*@Lenguajes({
		@Lenguaje("Python"),
		@Lenguaje("Java")
	})*/
	//1.8
	@Lenguaje("Python")
	@Lenguaje("Java")
	public interface LenguajeProramacion{
		
	}

	public static void main(String[] args) {
		
		Lenguaje[]	lenguajeArray = LenguajeProramacion.class.getAnnotationsByType(Lenguaje.class);
		System.out.println("Se tiene " + lenguajeArray.length + " anotaciones en el Lenguaje");
		
		Lenguajes len = LenguajeProramacion.class.getAnnotation(Lenguajes.class);
		for( Lenguaje elemento : len.value()) {
			System.out.println(elemento.value());
		}

	}

}
