package com.ipartek.ejercicios.variablesYoperadores;

public class Ejercicio4 {

	public static void main(String[] args) {
		
	//byte esta en un rango de −128 a 127
	//El literal hexadecimal 0xFF es un int (255) igual.
    //Java representa int como 32 bits. Se ve así en binario 00000000 00000000 00000000 11111111
	// ¿Y por qué 0xff? esto en ((potencia de 2) - 1)
		byte num1 = -1; 
		int num1entero = (num1 & 0xFF); // 255
//		System.out.println(num1entero); 
		
		byte num2 = -33; 
		int num2entero = (num2 & 0xFF); // 223
//		System.out.println(num2entero); 
	
		int resultado = num1entero + num2entero;
		
		System.out.println("El resultado es " + resultado);
		
		
//		byte num3 = (byte)Short.parseShort("00000001", 2);
//		int numBytesReversed = Integer.reverseBytes(num1);
//		System.out.println(numBytesReversed);
	
		
		
		
		
	
		
		
		
	}

}
