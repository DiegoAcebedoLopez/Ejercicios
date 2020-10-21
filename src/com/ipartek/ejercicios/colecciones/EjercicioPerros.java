package com.ipartek.ejercicios.colecciones;

import java.util.ArrayList;
import java.util.Iterator;

import com.ipartek.pojo.Perro;

public class EjercicioPerros {

	public static void main(String[] args) {
		
		// Laika, Hachiko
		ArrayList<Perro> perros = new ArrayList<Perro>();
		
		Perro Laika = new Perro();
		Laika.setNombre("Laika");
		
		Perro Hachiko = new Perro();
		Hachiko.setNombre("Hachiko");
		
		Perro Balto = new Perro();
		Balto.setNombre("Balto");
		
		Perro Rintintin = new Perro();
		Rintintin.setNombre("Rin tin tin");
		
		perros.add(Laika);
		perros.add(Hachiko);
		perros.add(Balto);
		perros.add(Rintintin);
		

		// insertar en una posicion
		Perro Stubby = new Perro();
		Stubby.setNombre("Stubby");
		perros.add(1, Stubby);
		
		// reemplazar
		perros.set(1,Rintintin );
		
		// eliminar por indice
		perros.remove(4);
		
		// recuperar un perro es decir te devuelve un perro por la posicion		
		Perro s = perros.get(0); 
		System.out.println(s);
		
		// recuperar longtiud
		System.out.println(perros.size());	
		
		// obtener la posicion de un objeto dentro del array
				int posicion = perros.indexOf(Laika);
				System.out.println(posicion);
		
	for (Iterator<Perro> iterator = perros.iterator(); iterator.hasNext();) {
			
			Perro perrito = iterator.next();
			System.out.println(perrito.toString());
			
		}

	}

}
