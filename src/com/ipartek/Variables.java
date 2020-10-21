package com.ipartek;

/**
 * Es un ejercicio para aprender a declarar variables en Java
 * 
 * @author Diego Acebedo Lopez
 * @version 1.0
 * 
 *
 */
public class Variables {

	public static void main(String[] args) {
		String nombre = "Diego";
		int edad = 99;
		float sueldo = 6521.99f;
		float sueldo2 = (float)6521.99;
		char sexo = '2';
		boolean isCovidAffeted = false;
		
		System.out.println("Hola " + nombre);
		System.out.println("Mi edad es " + edad);
		System.out.println("Mi sueldo es " + sueldo2);
		System.out.println("Mi sexo es " + sexo);
		
		if (isCovidAffeted) {
			System.out.println("** Tienesque hacerte un PCR");
		}
		else {
			System.out.println("Estas sano");
		}
		
		switch (sexo) {
		case 'v': {
			
			System.out.println("Eres varon");
			break;
		}
		
		case 'm': {
			
			System.out.println("Eres mujer");
			break;
		}
		default:
			System.out.println("No sabemos lo que eres");
			break;
		}

	}
	

}
