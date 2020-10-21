package com.ipartek.ejercicios.estructurasCondicionales;

/**
 * Realiza un programa que pida un numero por consola. En caso de que el numero
 * sea mayor que 50, o menor que 0, indicar que el numero introducido no es
 * valido
 * 
 * @author Diego Acebedo
 *
 * @version 1.0
 *
 */



public class Ejercicio1 {

	public static void main(String[] args) {
		
		int a = 6;
		int b = 8;
		int c = 0;
		int d = 8;
		int e = 9;

		int max = 0;
		int min = 10;

		int[] arrNumeros= {a,b,c,d,e};

		// caul es el mayor a o c

		if(a>c)
		{

			System.out.println("el numero " + a + " es mayor a " + c);

		}else
		{

			System.out.println("el numero " + c + " es mayor a " + a);

		}

		// numero mas alto

		for(int i = 0;i<arrNumeros.length;i++)
		{

			if (max < arrNumeros[i]) {

				max = arrNumeros[i];

			}

		}

		System.out.println(max);

		// numero mas bajo

		for(
		int i = 0;i<arrNumeros.length;i++)
		{

			if (min > arrNumeros[i]) {

				min = arrNumeros[i];

			}

		}System.out.println(min);

		// comprobar si b y d son iguales

		if(b==d)
		{

			System.out.println("Los numeros son iguales");

		}else
		{

			System.out.println("Los numeros no son iguales");
		}

	}
		
		
	}
	
	
