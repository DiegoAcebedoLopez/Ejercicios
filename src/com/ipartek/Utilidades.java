package com.ipartek;

public class Utilidades {
	
	
	/**
	 * Calcula la letra del DNI
	 * @param numeros String son los 8 numeros del DNI
	 * @return dni completo con los numeros + letra
	 * @throws Exception si no pasamos como parametros 8 numeros
	 */
	static public String calcularLetraDni ( String numeros ) throws Exception {
		
		final char [] letras = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
		
		
		if ( numeros == null ) {
			throw new Exception("No puede ser null");
		}
		
		if ( numeros.length() != 8 ) {
			throw new Exception("Los numeros de un dni son 8");
		}
		
		int numerosParseados = Integer.parseInt(numeros);
		int resto;
        resto = numerosParseados % 23;
       
				
				
		//TODO rellenar codigo
		
		return "DNI COMPLETO ES "+numeros+letras[resto];
	}

}