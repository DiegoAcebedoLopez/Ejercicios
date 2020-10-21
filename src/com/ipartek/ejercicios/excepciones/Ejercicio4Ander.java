package com.ipartek.ejercicios.excepciones;

import java.util.ArrayList;
import java.util.Scanner;

import com.ipartek.pojo.Persona;

/**
 * Crea una clase Persona con los atributos nombre y edad. <br>
 * En el método setEdad lanzar una excepción si la edad introducida es menor que 0 o mayor que 120.<br>
 * Realiza un programa que al comienzo cree una lista de personas haciendo uso del constructor vacío, y lea los datos por teclado y los asigne a los objetos creados. Solo introducirá las personas en la lista si están en el rango de edad indicado, comprobándolo mediante el uso de excepciones.
 * <br>
 * Ej: probar a crear las siguientes personas: 
 * <ol>   
 *   <li>“pepe” con 56 años</li>
 *   <li>“matusalem” con 199 años</li>
 *  </ol> 
 *
 * @author ur00
 * @version 1.0
 *
 */
public class Ejercicio4Ander {

	public static void main(String[] args) {

		// Lo que aparece entre <> se llama CASTEAR y sirve para indicar el tipo de
		// Objetos que tenemos dentro del Array
		ArrayList<Persona> personas = new ArrayList<Persona>();
		String respuesta = "Si";
		Scanner leerTeclado = new Scanner(System.in);
		while (respuesta.equals("Si")) {
			try {

				Persona p1 = new Persona();

				System.out.println("Introduce un nombre");

				String nombre = leerTeclado.nextLine();
				p1.setNombre(nombre);

				System.out.println("Introduce una edad");
				int edad = leerTeclado.nextInt();
				p1.setEdad(edad);

				personas.add(p1);

//			Persona p2 = new Persona();		
//			p2.setNombre("MAtusalem");
//			p2.setEdad(300); // CUIDADO lanza una Exception y va directo al Catch, no ejecuta las lineas de abajo

//			personas.add(p2);
				leerTeclado.nextLine();
				System.out.println("Quieres agregar mas personas?");
				respuesta = leerTeclado.nextLine();

			} catch (Exception e) {
				System.out.println(e.getMessage());

			} finally {

				if (respuesta.equals("No")) {

					// foreach para iterar sobre el ArrayList<Perona>
					for (Persona p : personas) {
						System.out.println(p.getNombre());
						System.out.println(p.getEdad());
						 System.out.println(p); //Sale cada persona
						// System.out.println(personas); Salen todas las personas juntas repetidas el
						// numero de vueltas de bucle repetidos

					}

					break;
				}

				// for de toda la vida
				/*
				 * for (int i = 0; i < personas.size(); i++) { System.out.println(
				 * personas.get(i)); }
				 */

			}

		}
		// System.out.println(p); // llamamos al metodo .toString()
		// System.out.println(p.toString());

		//
	}

}