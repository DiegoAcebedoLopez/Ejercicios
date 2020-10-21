package com.ipartek.ejercicios.excepciones;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		
		
		try {
			

			float a = 0;
			float b = 0;
			float resultado;
			
			Scanner leerdatos = new Scanner(System.in);
			
			System.out.println("Introduce el primer n�mero:");			
			a =  Integer.parseInt( leerdatos.nextLine() );
					
			System.out.println("Introduce el segundo n�mero:");
			b =  Integer.parseInt( leerdatos.nextLine() );
			
			resultado = a/b;
			
			
			if (b == 0 ) {
				System.out.println("Ocurrio un error aritm�tico");
			}
			else {
				
				System.out.println("La divisi�n es " + a + " / " + b + " = " + resultado);
			}
			
			
		} 
		
		
		catch (ArithmeticException e) {
		//	e.printStackTrace();
			System.out.println("Ocurrio un error aritm�tico");
			
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
