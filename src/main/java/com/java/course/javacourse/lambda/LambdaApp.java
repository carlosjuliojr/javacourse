package com.java.course.javacourse.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Hello world!
 *
 */
public class LambdaApp {

	public void ordenar(){
		
		List<String> list = new ArrayList<String>();
		list.add("Pedro");
		list.add("JulioJaimes");
		list.add("Yohana");
		list.add("Julio");
		list.add("Veltran");
	
		/*Collections.sort(list, new Comparator<String>() {

			@Override
			public int compare(String arg0, String arg1) {
				// TODO Auto-generated method stub
				return arg0.compareTo(arg1);
			}
			
		});*/
		
		Collections.sort(list, (String p1,String p2) -> p1.compareTo(p2));
		
		for(String e :list ) {
			System.out.println(e);
		}
	
	}
	
	public void calcular() {
		
		Operation operation = new Operation() {
			

			@Override
			public double calcularPromedio(double number1, double number2) {
				// TODO Auto-generated method stub
				return (number1+number2)/2;
			}
		};
		
		System.out.println(operation.calcularPromedio(3, 2));
		
	}
	
//######################################################################################
	
	/*
	 * Lambda Scopes
	 */
	
	public double probarLocalVariable() {
		
		final double number3 = 3;
		
		Operation op = new Operation() {
			
			@Override
			public double calcularPromedio(double number1, double number2) {
				// TODO Auto-generated method stub
			//	number3  = number1 + number2;
				return (number3 + number1 + number2) / 3;
			}
		};
		
		Operation operation = (x,y) -> {
			
			return number3+x+y;
		};
		
		return operation.calcularPromedio(2, 3);
		
	}

    public static void main( String[] args )
    {
    		
    	LambdaApp lambda = new LambdaApp();
    	
    	lambda.ordenar();
    	lambda.calcular();
    	System.out.println(lambda.probarLocalVariable());
        
    }
}
