package com.ipartek.ejerciciosPracticos;

import java.util.Scanner;

/**
 * 
 * <ul>
 * <b>Realizar un programa en java que realice la siguiente función:
 * <ul>
 * </b> <br>
 * <li>Crear un array de 5 notas que almacenara en formato double.</li>
 * <li>Una vez creado dicho array se rellenaran dichos elementos leyéndolo desde
 * el teclado.</li>
 * <li>Una vez creado el contenido, se calculara la media de las notas así como
 * se mostraran las notas más altas y más bajas de dicho array.</li><br>
 * 
 * @author Diego Acebedo
 * @version 1.0
 *
 */

public class EjercicioPractico1A {

	public static void main(String[] args) {
		try {
			Scanner leerTeclado = new Scanner(System.in);
			double[] arrayNotas = { 0d, 0d, 0d, 0d, 0d }; // Creamos el array y lo inicializamos
			double primeraNota = 0.0d;
			double segundaNota = 0.0d;
			double terceraNota = 0.0d;
			double cuartaNota = 0.0d;
			double quintaNota = 0.0d;
			double media = 0.0d;
			double notaAlta = 0d;
			double notaBaja = 0d;
			System.out.println("Introduce la primera nota");
			primeraNota = leerTeclado.nextDouble();
			leerTeclado.nextLine();
			System.out.println("Introduce la segunda nota");
			segundaNota = leerTeclado.nextDouble();
			System.out.println("Introduce la tercera nota");
			terceraNota = leerTeclado.nextDouble();
			System.out.println("Introduce la cuarta nota");
			cuartaNota = leerTeclado.nextDouble();
			System.out.println("Introduce la quinta nota");
			quintaNota = leerTeclado.nextDouble();
			arrayNotas[0] = primeraNota;
			arrayNotas[1] = segundaNota;
			arrayNotas[2] = terceraNota;
			arrayNotas[3] = cuartaNota;
			arrayNotas[4] = quintaNota; // Rellenamos el array con las notas escritas por teclado

			for (int i = 0; i < arrayNotas.length; i++) {
				media = media + arrayNotas[i]; // Total de todas las notas sumadas para dividirlas despues

				if (arrayNotas[i] >= arrayNotas[0] && arrayNotas[i] >= arrayNotas[1] && arrayNotas[i] >= arrayNotas[2]
						&& arrayNotas[i] >= arrayNotas[3] && arrayNotas[i] >= arrayNotas[4]) {
					notaAlta = arrayNotas[i]; // Calculo de la nota maxima (nota mas alta)
				}

				if (arrayNotas[i] <= arrayNotas[0] && arrayNotas[i] <= arrayNotas[1] && arrayNotas[i] <= arrayNotas[2]
						&& arrayNotas[i] <= arrayNotas[3] && arrayNotas[i] <= arrayNotas[4]) {
					notaBaja = arrayNotas[i]; // Calculo de la nota minima (nota mas baja)
				}

			}
			media = media / arrayNotas.length; // Calculo de la nota media
			System.out.println("La nota media es: " + media);
			System.out.println("La nota mas alta es: " + notaAlta);
			System.out.println("La nota mas baja es: " + notaBaja);

		} catch (ArithmeticException e) {

			System.out.println("Ocurrio un error aritmético");

		}

		catch (NumberFormatException e) {

			System.out.println("Ocurrio un error de formato porque introduciste caracteres");

		} catch (Exception e) {
			System.out.println("Ocurrio un error, introduce caracteres validos");
		}

	}

}
