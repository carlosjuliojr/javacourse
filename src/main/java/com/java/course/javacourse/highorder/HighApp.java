package com.java.course.javacourse.highorder;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class HighApp {

	/*
	 * Function the first k value represent imput value the second v value represent
	 * output value in the function.
	 */
	private Function<String, String> converterUpperCase = x -> x.toUpperCase();
	private Function<String, String> converterLowerCase = x -> x.toLowerCase();

	public void imprimir(Function<String, String> function, String value) {
		System.out.println(function.apply(value));
	}

	public Function<String, String> show(String messagge) {
		return (String x) -> messagge + x;
	}

	public void filter(List<String> list, Consumer<String> consumer, int longitude) {
		list.stream().filter(this.establecerLogicaFiltro(longitude)).forEach(consumer);
	}
	
	public void filter(List<String> list, Consumer<String> consumer, int longitude, String cadena) {
		list.stream().filter(this.establecerLogicaFiltro(cadena)).forEach(consumer);
	}

	public Predicate<String> establecerLogicaFiltro(int longitude) {
		return texto -> texto.length() < longitude;

	}

	public Predicate<String> establecerLogicaFiltro(String cadena) {
		return texto -> texto.contains(cadena);

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HighApp app = new HighApp();

//		app.imprimir(app.converterUpperCase, "testing this method");
//		app.imprimir(app.converterLowerCase, "HELLO WORLD");
//		System.out.println(app.show("testing").apply(" the app"));

		List<String> list = new ArrayList<String>();
		list.add("Marcos");
		list.add("Alex");
		list.add("Carlos");
		list.add("Yorman");

//		app.filter(list, System.out::println, 5);
		app.filter(list, System.out::println, 0, "os");
	}

}
