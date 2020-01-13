package com.java.course.javacourse.methodReference;

import java.util.Arrays;

public class MethodReferenceApp {

	public static void referenciarMethodStatic() {
		System.out.println("Metodo referido static");
	}

	public void referenciarMetodoInstanciaObjetoArbitrario() {
		String[] names = {"marco","alexander","juan", "carlos"};
		/*
		Arrays.sort(names, new Comparator<String>() {

			@Override
			public int compare(String arg0, String arg1) {
				// TODO Auto-generated method stub
				return arg0.compareTo(arg1);
			}
			
		});
		*/
		
//		Arrays.sort(names, (s1, s2) -> s1.compareTo(s2));
//		System.out.println(Arrays.toString(names));
		
		Arrays.sort(names, String::compareToIgnoreCase);
		System.out.println(Arrays.toString(names));
	}
	
	public void referenciarMetodoInstanciaObjetoParticular() {
		System.out.println("Metodo referido Instancia de un objeto en Particular");
	}

	public void operar() {
//		Operation op = () -> MethodReferenceApp.referenciarMethodStatic();
//		op.Saludar();

		Operation op2 = MethodReferenceApp::referenciarMethodStatic;
		op2.Saludar();
	}

public void referenciarConstructor() {
		
		/*IPersona iper = new IPersona() {
			
			@Override
			public Persona crear(int id, String name) {
				// TODO Auto-generated method stub
				return new Persona(id, name);
			}
		};
		
		iper.crear(1, "julio");*/
		/*
		IPersona iper2 = (x,y)-> new Persona(x,y);
		Persona per = iper2.crear(1, "juan");
		System.out.println(per.getId() + " - " + per.getName());
		*/
	
		IPersona iper3 = Persona::new;
		Persona per = iper3.crear(2, "Yohana");
		System.out.println(per.getId() + " - " + per.getName());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodReferenceApp app = new MethodReferenceApp();
//		app.operar();
//		app.referenciarMetodoInstanciaObjetoArbitrario();

//		Operation op = app::referenciarMetodoInstanciaObjetoParticular;
//		op.Saludar();
		
		app.referenciarConstructor();
	}
	
	

}
