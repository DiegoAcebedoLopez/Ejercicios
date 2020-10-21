package com.ipartek.ejercicios.variablesYoperadores;

import java.util.Scanner;
public class Ejercicio3 {

	public static void main(String[] args) {
		
		float numero1 = 0;
		float numero2 = 0;
		float resultado;
		
		Scanner leerdatos = new Scanner(System.in);
		
		System.out.println("Introduce el primer número:");			
		numero1 = leerdatos.nextFloat();
				
		System.out.println("Introduce el segundo número:");
		numero2 = leerdatos.nextFloat();
		
		resultado = numero1/numero2;
		System.out.println("La división es " + numero1 + " / " + numero2 + " = " + resultado);

	}

}
