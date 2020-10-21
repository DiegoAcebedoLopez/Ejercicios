package com.ipartek.ejercicios.colecciones;

import java.util.ArrayList;

import com.ipartek.pojo.Perro;

/**
 * Ejercicio para aprender los metodos básicos de java.util.ArrayList
 * @author ur00
 *
 */
public class EjercicioPerrosAnder {

	public static void main(String[] args) {
		
		
		ArrayList<Perro> lista = new ArrayList<Perro>();
		
		lista.add( new Perro("Bubba") );
		lista.add( new Perro("Laika") );
		lista.add( new Perro("Rintintin") );
		lista.add( new Perro("goffy") );
		lista.add( new Perro("Jose", "Historia maravillosa")); //añadir objetos a un arraylist con sets directamente mediante constructor sobrecargado
		
		Perro snoppy = new Perro("Juan","Vaya Historia"); // añadir sets directamente median constructor sobrecargado
		
		System.out.println("Nombre de perro: " + snoppy.getNombre() + " \nHistoria de perro: " + snoppy.getHistoria());
		
		//vamos a recorrer el array para buscar a "Rintintin"
		for (int i = 0; i < lista.size() ; i++) {
			
			Perro pIteracion = lista.get(i);
			
			if ( "Rintintin".equals(pIteracion.getNombre()) ) {
				lista.remove(i);
				break; // salir del for
			}
			
		}// for
		
		
		
		System.out.println("Agur Venur");
		
		
	}

}