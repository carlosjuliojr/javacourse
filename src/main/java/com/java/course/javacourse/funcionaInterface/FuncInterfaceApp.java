package com.java.course.javacourse.funcionaInterface;

public class FuncInterfaceApp {
	
	public double operar(double x, double y) {
		
		Operation op = (n1,n2) -> n1+n2;
		return op.calcular(x, y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FuncInterfaceApp app = new FuncInterfaceApp();
		System.out.println(app.operar(2, 3));

	}

}
