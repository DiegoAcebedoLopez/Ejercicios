package com.ipartek.apps;

import java.util.ArrayList;
import java.util.Scanner;

import com.ipartek.pojo.Perro;

public class AppPerrera {
	// funciones static se pueden llamar directamente sin crear un objeto para llamarlas, ademas solo ocupan 1 vez en memoria en objetos (int static Num_Maximo perros = 9) y en el main como es static todas las variables tienen que crearse static
	// variables globales para esta Clase
	static Scanner sc = null;
	static ArrayList<Perro> lista = new ArrayList<Perro>();
	static String opcion = ""; // opcion seleccionada en el menu por el usuario
	static String respuesta = "No";

	public static void main(String[] args) {
		incializarDatos();

		while (respuesta.equals("No")) {
			System.out.println("***********  APP  PERRERA   **************");
			sc = new Scanner(System.in);
			
			
			
			pintarMenu();
			
			
		
			// TODO cambiar "1","2","3" etc por constantes
			
			switch (opcion) {
		
			case "1":
				listar();
				break;
			case "2":
				crearPerro();
				break;
			case "3":
				darBajaPerro();
				break;
			case "4":
				modificarPerro();
				break;
			case "S":
				cerrarPrograma();
			default:
				System.out.println("Opcion incorrecta, escriba la opcion de nuevo");
				break;
				
			}

		
			

			}
		
	}	   
		
			
		
	private static void modificarPerro() {
		
		String nombrePerro = "";
		String nombrePerroNuevo = "";
		String razaPerro = "";
		String razaPerroNuevo = "";
		Float pesoPerro = 0f;
		Float pesoPerroNuevo = 0f;
		boolean vacunaPerro = true;
		boolean vacunaPerroNuevo = true;
		String historiaPerro = "";
		String historiaPerroNuevo = "";
		String respuestaModificar = "";
		int contador = 1;
		System.out.println("Seleccione el perro que quiere modificar sus datos");

		for (int i = 0; i < lista.size(); i++) {

			Perro p = lista.get(i);

			System.out.println(contador + "- " + p.getNombre());

			contador++;
		}
		int opcionModificar = sc.nextInt();
		sc.nextLine();
		System.out.println(lista.get(opcionModificar - 1));
		nombrePerro = lista.get(opcionModificar - 1).getNombre();
		System.out.println("Quieres cambiar el nombre " + nombrePerro + "?");
		respuestaModificar = sc.nextLine();
		if (respuestaModificar.equalsIgnoreCase("Si")) {
			System.out.println("Introduce nombre nuevo");
			nombrePerroNuevo = sc.nextLine();
			lista.get(opcionModificar - 1).setNombre(nombrePerroNuevo);
		}
		razaPerro = lista.get(opcionModificar - 1).getRaza();
		System.out.println("Quieres cambiar la raza " + razaPerro + "?");
		respuestaModificar = sc.nextLine();
		if (respuestaModificar.equalsIgnoreCase("Si")) {
			System.out.println("Introduce raza nueva");
			razaPerroNuevo = sc.nextLine();
			lista.get(opcionModificar - 1).setRaza(razaPerroNuevo);
		}
		pesoPerro = lista.get(opcionModificar - 1).getPeso();
		System.out.println("Quieres cambiar el peso " + pesoPerro + "?");
		respuestaModificar = sc.nextLine();
		if (respuestaModificar.equalsIgnoreCase("Si")) {
			System.out.println("Introduce peso nuevo");
			pesoPerroNuevo = sc.nextFloat();
			lista.get(opcionModificar - 1).setPeso(pesoPerroNuevo);
		}
		sc.nextLine();
		vacunaPerro = lista.get(opcionModificar - 1).isVacunado();
		System.out.println("Quieres cambiar si esta vacunado o no?" + " \nAhora mismo esta en: " + vacunaPerro);
		respuestaModificar = sc.nextLine();
		if (respuestaModificar.equalsIgnoreCase("Si")) {
			System.out.println("Introduce true si esta vacunado y false si no lo esta:");
			vacunaPerroNuevo = sc.nextBoolean();
			lista.get(opcionModificar - 1).setVacunado(vacunaPerroNuevo);
		}
		sc.nextLine();
		historiaPerro = lista.get(opcionModificar - 1).getHistoria();
		System.out.println("Quieres cambiar la historia de el perro? " +  " \n La historia actual es: " + historiaPerro );
		respuestaModificar = sc.nextLine();
		if (respuestaModificar.equalsIgnoreCase("Si")) {
			System.out.println("Introduce historia nueva");
			historiaPerroNuevo = sc.nextLine();
			lista.get(opcionModificar - 1).setHistoria(historiaPerroNuevo);
		}
	}



	private static void darBajaPerro() {
		
		int contador = 1;
		System.out.println("Seleccione el perro que quiere dar de baja");
		

	for (int i = 0; i < lista.size() ; i++) {
			
			Perro p = lista.get(i);
			
			
			System.out.println(contador+"- "+p.getNombre());
			
			
			

			contador++;
		}
	int	opcionBaja = sc.nextInt();
	lista.remove(opcionBaja-1);
	
	}



	private static void crearPerro() {
	
		System.out.println("Introduce nombre de el perro");
		String	nombre = sc.nextLine();
		System.out.println("Introduce raza de el perro");
		String	raza = sc.nextLine();
		System.out.println("Introduce peso de el perro");
		Float	peso = sc.nextFloat();
		sc.nextLine();
		System.out.println("�Esta vacunado?");
		Boolean	vacuna = sc.nextBoolean();
		sc.nextLine();
		System.out.println("Introduce la historia de el perro");
		String	historia = sc.nextLine();
		lista.add( new Perro(nombre,raza,peso,vacuna,historia ));
		
	}



	private static void cerrarPrograma() {
		System.out.println("***********  ADIOS, nos vemos pronto   **************");
		respuesta = "Si";
		sc.close();
			
	}



	// main


	private static void listar() {
		
		for (Perro perro : lista) {
			//TODO dar formato para mostrar solo nombre y raza
			//System.out.println(perro);
			System.out.println("-----------------------------------------------------------------------------");
			System.out.println("Perro: " + perro.getNombre() + " \nRaza: " + perro.getRaza() + " \nPeso: " + perro.getPeso() + " \nVacuna:" + perro.isVacunado() + " \nHistoria:" + perro.getHistoria());
			System.out.println("-----------------------------------------------------------------------------");
		}
		
	}


	/**
	 * Inicializar el ArrayList para simular que existen perros.<br>
	 * En un futuro nos conectaremos a una bbdd
	 */
	private static void incializarDatos() {
		
		lista.add( new Perro("Bubba") );
		lista.add( new Perro("Laika") );
		lista.add( new Perro("Rintintin") );
		lista.add( new Perro("goffy") );
		
	}


	/**
	 * Se encraga de pintar las pociones del menu.<br>
	 * Fijaros que no aparece {@code @return} porque no retorna nada {@code void}
	 * 
	 */
	private static void pintarMenu() {
		
	
		
		System.out.println("************************************");
		System.out.println(" 1.- Listar todos los perros");
		System.out.println(" 2.- Crear un perro");
		System.out.println(" 3.- Dar de baja un Perro");
		System.out.println(" 4.- Modificar un perro");
		System.out.println(" ");
		System.out.println(" S - Salir");
		System.out.println("************************************");
		
		System.out.println("\n Selecciona una opcion del menu:");
		//TODO gestionar errores
		opcion = sc.nextLine();
		
		
		
	}
	
	

}// AppPerrera