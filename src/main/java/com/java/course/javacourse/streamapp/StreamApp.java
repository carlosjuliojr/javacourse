package com.java.course.javacourse.streamapp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamApp {

	private List<String> list;
	List<String> numbers;

	public StreamApp() {

		list = new ArrayList<String>();
		list.add("marcos");
		list.add("pedro");
		list.add("jorge");
		list.add("david");
		list.add("mario");

		numbers = new ArrayList<String>();
		numbers.add("1");
		numbers.add("2");

	}

	public void filter() {
		// filter all elements with start letter m
		list.stream().filter(x -> x.startsWith("m")).forEach(System.out::println);
	}

	public void order() {
		// Order all elements using stream
//			list.stream().sorted().forEach(System.out::println);
		// reverse order
		list.stream().sorted((String x, String y) -> y.compareTo(x)).forEach(System.out::println);
	}

	public void transform() {
		list.stream().map(String::toUpperCase).filter(x -> x.startsWith("P")).collect(Collectors.toList());
		/*
		for(String x : numbers) {
			int num = Integer.parseInt(x)+1;
			System.out.println(num);
		}
		*/
		
		numbers.stream().map(x->Integer.parseInt(x)+1).forEach(System.out::println);
		
	}
	
	public void limit() {
		list.stream().limit(2).forEach(System.out::println);
	}
	
	public void alphaMethod() {
		
		List<String> alpha =  Arrays.asList("a","b","c","d");
		System.out.println(alpha.size());
		System.out.println(alpha.contains("d"));
		
		@SuppressWarnings("rawtypes")
		List upperCase = alpha.stream().map(x -> x.toUpperCase()).collect(Collectors.toList());
		System.out.println(upperCase);
		System.out.println(alpha);
		alpha.stream().filter(x -> x.endsWith("d")).collect(Collectors.toList()).forEach(System.out::println);
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StreamApp app = new StreamApp();
//		app.filter();
//		app.order();
//		app.transform();
//		app.limit();
//		app.alphaMethod();


	}

}
