package com.ipartek.ejercicios.estructurasCondicionales;

import java.util.Scanner;


/**
* Realiza un programa que pida un numero por consola. 
* <ul>En caso de que el numero:</ul>
* <li><b>Sea mayor que 50, o menor que 0, indicar que el numero introducido no es valido</b></li>
* <li><b>Si esta entre el 0 y 50 que sea valido</b></li>
* <li><b>Si no introduce el numero entre 0 y 50 que se repita infinitamente y cuando llegue a 3 veces salte un mensaje</b></li>
* 
* @author Diego Acebedo
* @version 1.0
*
*/



public class EjercicioModificado2 {

	public static void main(String[] args) {
		
		
	
		
		int num1 = 0;
		Scanner sc = new Scanner(System.in);

		int contador = 0;

		for (int i = 0; i < 10; i++) {
			if (contador >= 3) {

				System.out.println("Eres tonto te he dicho que escribas un numero entre 0 y 50");
				// continue;
			}
			System.out.print("Ingrese un numero entre 0 y 50: ");
			num1 = Integer.parseInt(sc.nextLine());

			if (num1 > 50 || num1 < 0) {
				System.out.println("El numero introducido no es valido! el numero es: " + num1);
			}

			if (num1 < 50 || num1 < 0 || num1 == 50) {
				System.out.println("El numero introducido  es valido! el numero es: " + num1);
				break;
			}

			i--;
			contador++;

		}
			

		 

		   sc.close();
		   
		  } 

	}


