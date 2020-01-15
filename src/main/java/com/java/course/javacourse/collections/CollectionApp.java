package com.java.course.javacourse.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class CollectionApp {
	
	private List<String> list;
	
	public void fillList() {
		
		list = new ArrayList<String>();
		
		list.add("Juan");
		list.add("Beto");
		list.add("Alex");
		list.add("Niña");
		
	}
	
	public void useForEach() {
		
		/*for(String elemento : list) {
			System.out.println(elemento);
		}*/

//		list.forEach(x -> System.out.println(x));
		list.forEach(System.out::println);
	}

	public void useRemoveIf() {
		
		/*Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			if(it.next().equalsIgnoreCase("Juan")) {
				it.remove();;
			}
		}*/
		
		list.removeIf(x -> x.equalsIgnoreCase("Juan"));
		
	}

	public void useSort() {
//		Collections.sort(list);
		//Java 7
		/*list.sort(new Comparator<String>() {

			@Override
			public int compare(String arg0, String arg1) {
				// TODO Auto-generated method stub
				return arg0.compareTo(arg1);
			}
		});*/
		
		list.sort((x,b)-> x.compareTo(b));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CollectionApp app = new CollectionApp();
		app.fillList();
//		app.useForEach();
//		app.useRemoveIf();
		app.useSort();
		app.useForEach();
	}

}
