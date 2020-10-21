package com.ipartek.ejercicios.excepciones;

import java.util.Scanner;

import com.ipartek.pojo.Perro;
import com.ipartek.pojo.Persona;

import java.util.ArrayList;



public class Ejercicio4 {
	

	


	public static void main(String[] args) throws Exception {

		ArrayList<String> listaPersonas = new ArrayList<String>();
		ArrayList<Integer> edadPersonas = new ArrayList<Integer>();
		boolean errorExcepcion = true;
		Scanner leerTeclado = new Scanner(System.in);
		Persona Persona = new Persona();
		String respuesta = "Si";

		while (respuesta.equals("Si")) {

			do {

				System.out.println("Introduce un nombre");

				try {

					String nombre = leerTeclado.nextLine();

					Persona.setNombre(nombre);
					listaPersonas.add(Persona.getNombre());
					errorExcepcion = false;

				} catch (Exception e) {
					System.out.println("Ocurrio un error: " + e.getMessage());
				}
			} while (errorExcepcion);

			do {

				System.out.println("Introduce una edad");

				try {

					int edad = leerTeclado.nextInt();
					Persona.setEdad(edad);
					edadPersonas.add(Persona.getEdad());
					errorExcepcion = false;

				} catch (Exception e) {
					errorExcepcion = true;
					System.out.println("Ocurrio un error: " + e.getMessage());
				}
			} while (errorExcepcion);

			leerTeclado.nextLine();
			System.out.println("Quieres agregar mas personas?");
			respuesta = leerTeclado.nextLine();

			if (respuesta.equals("No")) {

				System.out.println("Lista de personas:");
				System.out.println("------------------------------------");
				System.out.println("Nombres: " + listaPersonas);
				System.out.println("------------------------------------");
				System.out.println("Edades: " + edadPersonas);
				System.out.println("------------------------------------");
				// System.out.println(Persona.toString());
				break;
			}

		}

	}

}
