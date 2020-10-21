package com.ipartek.ejercicios.variablesYoperadores;

/**
 * Es el ejercicio 1
 * 
 * @author Diego Acebedo Lopez
 * @version 1.0
 * 
 *
 */

public class Ejercicio1 {

	


	public static void main(String[] args) {
		
		String nombre = "Diego";
		int edad = 27;
		float sueldo = 2050.99f;
		char sexo = 'h';
		boolean enfermo = false;
		
		System.out.println("Hola mi nombre es " + nombre + " ,Mi edad es " + edad + " ,Mi sueldo es " + sueldo + " ,Mi sexo es " + sexo + " ¿Estoy enfermo? " + enfermo );
		
//wrappers => son clases que envuelven a las variables primitivas con ciertas utilidades
		
		System.out.println("-------- int ----------------------");
		  System.out.println("Valor maximo = " + Integer.MAX_VALUE);
		  System.out.println("Valor minimo = " + Integer.MIN_VALUE);
		  
		  System.out.println("1 int = " + Integer.SIZE + " bits");  
		  System.out.println("1 short = " + Short.SIZE + " bits");
		  System.out.println("1 byte = " + Byte.SIZE + " bits");
		  System.out.println("1 long = " + Long.SIZE + " bits");
	}

}
