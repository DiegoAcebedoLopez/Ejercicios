package com.ipartek.ejercicios.excepciones;

import com.ipartek.Utilidades;
import java.util.Scanner;

/**
 *Realice un método que reciba como argumento un String y un número y muestre la letra de la posición indicada.<br>
 * Llámelo pasando como parámetro  un String sin inicializar. Dicha llamada se encontrara dentro de un bloque try catch, que en caso de producirse una excepción por un paso de parámetros a null, no acabe con la ejecución del programa. <br>
 * Así mismo, se controlara también que si el numero pasado es mayor que el tamaño del string, capturara el error y nos solicitara meter un numero valido, indicándonos los valores en los que puede estar comprendido (para este apartado se le pasa como string la cadena de texto “La lluvia en Sevilla no es una maravilla”)<br> 
 * @author Diego Acebedo
 * @version 1.0
 * 
 *
 */

public class Ejercicio3 {

	static public char buscarLetra(String frase) throws Exception {

		if (frase == null) {
			throw new Exception("No puede ser null");
		}

		String[] partes = frase.split("-");
		String parteFrase = partes[0];
		String parteNumero = partes[1];
		int parteNumeros = Integer.parseInt(parteNumero);

		if (frase.length() < parteNumeros) {

			int longitud = parteFrase.length() - 1;
			throw new Exception(
					"Metiste un numero invalido. Los numeros deben estar comprendidos entre 0 y " + longitud);

		}

		String cadena = new String(parteFrase);

		char letra = cadena.charAt(parteNumeros);

		return letra;
	}

	public static void main(String[] args) {

		try {
			Scanner leerTeclado = new Scanner(System.in);

			System.out.println("Introduce una frase con un guion al final y un numero:");
			String frase = leerTeclado.nextLine();

			char letraBusqueda = Ejercicio3.buscarLetra(frase);
			System.out.println(letraBusqueda);

		} catch (Exception e) {
			System.out.println("Hubo un error\n" + e.getMessage());

		}

	}

}
