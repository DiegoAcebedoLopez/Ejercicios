package com.ipartek.pojo;

public class Persona {
	

	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
	}


	final static int EDAD_MIN = 0;
	final static int EDAD_MAX = 120;
	
	
	private String nombre;
	private int edad;
	
	
	public Persona(String nombre, int edad) {
		this();
		this.nombre = nombre;
		this.edad = edad;
	}


	public Persona() {
		super();
		
		this.nombre = "";
		this.edad = 0;
		
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) throws Exception {
		
		if(edad < EDAD_MIN || edad > EDAD_MAX) {
			throw new Exception("Metiste una edad invalida");
			
		}
		else{
			
			this.edad = edad;
		}
		
		
	}

}
