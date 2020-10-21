package com.ipartek.ejercicios.excepciones;

import java.util.Scanner;
public class Ejercicio2 {
	
	public static void main(String[] args) {
		
		
		
		int numero1 = 0;
		int numero2 = 0;
		boolean errorExcepcion = true;
		Scanner leerdatos = new Scanner(System.in);
		
		do {
			   System.out.print("Introduce el primer numero");
			   try {
				   numero1 = Integer.parseInt(leerdatos.nextLine());
				   errorExcepcion = false;
			   } catch (Exception e) {
				   System.out.println("No has introducido un valor numerico en el primer numero");

			   }

			  } while (errorExcepcion);
		
		
		do {
			   System.out.print("Introduce el segundo numero");
			   try {
				   numero2 = Integer.parseInt(leerdatos.nextLine());
				   errorExcepcion = false;
			   } catch (Exception e) {
				   errorExcepcion = true;
			    System.out.println("No has introducido un valor numerico en el segundo numero");

			   }

			  } while (errorExcepcion);
		
		
		leerdatos.close();
		System.out.println("Primer numero es: " + numero1 + "\nSegundo numero es: " + numero2);
		
	}

}
