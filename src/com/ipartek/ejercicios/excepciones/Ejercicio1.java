package com.ipartek.ejercicios.excepciones;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		
		
		try {
			

			float a = 0;
			float b = 0;
			float resultado;
			
			Scanner leerdatos = new Scanner(System.in);
			
			System.out.println("Introduce el primer número:");			
			a =  Integer.parseInt( leerdatos.nextLine() );
					
			System.out.println("Introduce el segundo número:");
			b =  Integer.parseInt( leerdatos.nextLine() );
			
			resultado = a/b;
			
			
			if (b == 0 ) {
				System.out.println("Ocurrio un error aritmético");
			}
			else {
				
				System.out.println("La división es " + a + " / " + b + " = " + resultado);
			}
			
			
		} 
		
		
		catch (ArithmeticException e) {
		//	e.printStackTrace();
			System.out.println("Ocurrio un error aritmético");
			
		} 
		
		catch (NumberFormatException e) {
		//	e.printStackTrace();
			
			System.out.println("Ocurrio un error de formato porque introduciste caracteres");
			
		} 
		catch (Exception e) {
		//	e.printStackTrace();
			System.out.println("Ocurrio un error desconocido");
			
		} 
		
	
		
		
		

	}

}
