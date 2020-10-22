package com.ipartek.ejerciciosPracticos;

import java.util.Scanner;

/**
 * 
 * *
 * <ul>
 * <b>Crear un proyecto en modo consola que nos muestre un menú de 3 opciones:
 * <ul>
 * </b> <br>
 * <li>Calcular la letra del dni</li>
 * <li>Calcular medida de cm a pulgadas</li>
 * <li>Salir</li><br>
 * Hacer que dicho menú se ejecute en bucle hasta que se pulse salir, y si el
 * usuario escoge cada una de las funciones, que permita introducir los datos
 * correspondientes por teclado para poder dar el resultado<br><br>
 * 
 * @author Diego Acebedo
 * @version 1.0
 *
 */

public class EjercicioPractico1B {

	static Scanner leerTeclado = new Scanner(System.in); // Lectura por teclado
	static String opcion = "";
	static String respuesta = "No";

	public static void main(String[] args) {

		while (respuesta.equals("No")) {

			dibujarMenu();
			System.out.println("Elige una opcion:");
			leerTeclado = new Scanner(System.in);
			opcion = leerTeclado.nextLine();
			// Creacion de el menu
			switch (opcion) {

			case "1":
				primeraOpcion(); // Metemos datos de para sacar la letra de el DNI
				continuar(); // Pulsamos boton para continuar
				break;
			case "2":
				segundaOpcion(); // Conversion a pulgadas
				continuar2(); // Pulsamos boton para continuar
				break;
			case "S":
				cerrarPrograma(); // Cerramos el programa

			default:
				if (opcion.equalsIgnoreCase("S")) {

				} else {
					System.out.println("Opcion incorrecta, escriba la opcion de nuevo"); // Opcion incorrecta
					continuar(); // Pulsamos boton para continuar
				}

				break;

			}

		}
	}

	private static void continuar2() {
		System.out.println("Pulsa cualquier tecla para continuar..");
		leerTeclado.nextLine();
		leerTeclado.nextLine();

	}

	private static void continuar() {
		System.out.println("Pulsa cualquier tecla para continuar..");
		leerTeclado.nextLine();

	}

	private static void segundaOpcion() {
		// Conversion a pulgadas
		try {
			float cm = 0f;
			float pulgadas = 0f;
			System.out.println("Introduzca los Centímetros que quiere para convertir Centímetros a Pulgadas:");
			cm = leerTeclado.nextFloat();
			pulgadas = cm / 2.54f;
			System.out.println("Las pulgadas de " + cm + " Centímetros" + " son: " + pulgadas);
		} catch (Exception e) {

			System.out.println(" Lo sentimos pero has escrito caracteres invalidos");
		}

	}

	private static void primeraOpcion() {
		// Metemos datos de para sacar la letra de el DNI
		System.out.println("Dime los 8 numeros de tu dni:");
		String dniNumeros = leerTeclado.nextLine();

		try {
			String dniCompleto = calcularLetraDni(dniNumeros);
			System.out.println("Aqui esta la informacion: " + dniCompleto);

		} catch (Exception e) {

			System.out.println(" Lo sentimos pero tu dni no es valido '" + dniNumeros + "'");
		}

	}

	private static void dibujarMenu() {
		System.out.println("**************************************"); // Creacion de el menu dibujado
		System.out.println("                 MENU                 ");
		System.out.println("**************************************");
		System.out.println(" 1.- Calcular la letra del dni");
		System.out.println(" 2.- Calcular medida de cm a pulgadas");
		System.out.println(" ");
		System.out.println(" S - Salir");
		System.out.println("**************************************");
	}

	private static String calcularLetraDni(String numeros) throws Exception {
		// Calculo de la letra de el DNI
		final char[] letras = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q',
				'V', 'H', 'L', 'C', 'K', 'E' };

		if (numeros == null) {
			throw new Exception("No puede ser null");
		}

		if (numeros.length() != 8) {
			throw new Exception("Los numeros de un dni son 8");
		}

		int numerosParseados = Integer.parseInt(numeros);
		int resto;
		resto = numerosParseados % 23;

		return "DNI COMPLETO ES " + numeros + letras[resto];
	}

	private static void cerrarPrograma() {
		System.out.println("***********  Hasta luego nos vemos   **************");
		respuesta = "Si";
		leerTeclado.close();

	}

}
