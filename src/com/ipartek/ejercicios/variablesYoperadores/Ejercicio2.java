package com.ipartek.ejercicios.variablesYoperadores;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		int num1, num2, num3, num4, num5, num6, num7, num8, num9, num10, totalsuma, totalresta;
		int array[] = { 10, 5, 1, 2, 9, -10, -5, -1, -2, -9 };
		double media = 0.0;
		num1 = 10;
		num2 = 5;
		num3 = 1;
		num4 = 2;
		num5 = 9;
		num6 = -10;
		num7 = -5;
		num8 = -1;
		num9 = -2;
		num10 = -9;
		totalsuma = num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9 + num10;
		totalresta = num1 - num2 - num3 - num4 - num5 - num6 - num7 - num8 - num9 - num10;

		for (int i = 0; i < array.length; i++) {
			media = media + array[i];
		}
		media = media / array.length;

		System.out.println("La suma total es: " + totalsuma);
		System.out.println("La resta total es: " + totalresta);
		System.out.println("La media es: " + media);

		int temperaturaSemana[] = { 14, 16, 19, 20, 23, 21, 20 };
		String diasSemana[] = { "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo" };
		float mediaSemana = 0;
		for (int i = 0; i < temperaturaSemana.length; i++) {
			mediaSemana = mediaSemana + temperaturaSemana[i];
			System.out.println(diasSemana[i] + " hace " + temperaturaSemana[i]);
		}
		mediaSemana = mediaSemana / temperaturaSemana.length;
		System.out.println("Media de la semana es: " + mediaSemana);
	//	System.out.printf("Media de la semana es %.2f ", mediaSemana );

	}

}
