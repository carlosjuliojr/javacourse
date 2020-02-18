package com.java.course.javacourse.streamapp;

import java.util.ArrayList;
import java.util.List;

public class ParallelStream {
	
	private List<Integer> numbers;
	
	public void fill() {
		numbers = new ArrayList<Integer>();
		for(int i = 0; i < 10; i++) {
			numbers.add(i);
		}
	}
	
	private void testingStream() {
		
		numbers.stream().forEach(System.out::println);
	}
	
	private void testingParallelStream() {
		numbers.parallelStream().forEach(System.out::println);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParallelStream app = new ParallelStream();
		app.fill();
//		app.testingStream();
		app.testingParallelStream();

	}




}
