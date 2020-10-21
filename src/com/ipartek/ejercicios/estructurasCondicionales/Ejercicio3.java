package com.ipartek.ejercicios.estructurasCondicionales;
import java.util.Scanner;
/**
* Pedir por teclado al usuario que introduzca una distancia en cm. 
* <ul>Una vez introducida, se solicitará que escoja a que unidad se van a convertir, introduciendo la opción por teclado:</ul>
* <li><b>A: convertir a metros</b></li>
* <li><b>B: convertir a pulgadas</b></li>
* <li><b>C: convertir a pies</b></li>
* <li><b>D:convertir a yardas</b></li>
* @author Diego Acebedo
* @version 1.0
*/


public class Ejercicio3 {
	
	public static void main(String[] args) {
		
		int centimentros = 0;	
		char opcion;
		System.out.println("Introduce una distancia en cm");
		Scanner leerTeclado = new Scanner(System.in);	
		centimentros = Integer.parseInt(leerTeclado.nextLine());
		System.out.println("Introduce opcion");
		opcion = leerTeclado.next().charAt(0); 
		System.out.println(opcion);
		
	}

}
