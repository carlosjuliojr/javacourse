package com.java.course.javacourse.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class App {

	private Map<Integer, String> map;

	public void fillMap() {
		map = new HashMap<>();
		map.put(1, "Juan");
		map.put(2, "Alexander");
		map.put(3, "Maria");

	}

	public void print_v7() {
		for (Entry<Integer, String> e : map.entrySet()) {
			System.out.println("Key: " + e.getKey() + " Value: " + e.getValue());
		}
	}

	public void print_v8() {

		// map.forEach((k, v) -> System.out.println("Key: " + k + " Value: " + v));
		map.entrySet().parallelStream().forEach(System.out::println);
	}

	public void recolectar() {
		Map<Integer, String> mapResult = map.entrySet().stream()
				.filter(e -> e.getValue()
				.contains("r"))
				.collect(Collectors.toMap(p->p.getKey(), p->p.getValue()));
		
		mapResult.entrySet().stream().forEach(System.out::println);
	}

	public void insertIfAusent() {

		// Just insert element if key does not exist into the map
		map.putIfAbsent(4, "Beto");
	}

	public void operarIfPresent() {
		map.computeIfPresent(3, (k, v) -> k + " " + v);
		System.out.println(map.get(3));
	}

	public void getOrPredeterminate() {
		String value = map.getOrDefault(4, "defaultValue");
		System.out.println(value);
	}

	public static void main(String[] args) {

		App app = new App();
		app.fillMap();
//		app.print_v7();
//		app.insertIfAusent();
//		app.print_v8();
//		app.operarIfPresent();
//		app.getOrPredeterminate();
		app.recolectar();

	}

}
