package com.ipartek.pojo;

public class Perro {
	

	public String toString() {
		return "Perro [nombre=" + nombre + ", raza=" + raza + ", peso=" + peso + ", isVacunado=" + isVacunado
				+ ", historia=" + historia + "]";
	}

		// Atributos, deben ser siempre privados
		// la forma de manipular estos atributos es a traves de los getteres y settres
		///////////////////////////////////////
		private String nombre;
		private String raza;
		private float peso;
		private boolean isVacunado;
		private String historia;
		// Constructor
		///////////////////////////////////////
		public Perro() {
			super();
			this.nombre = "Sin nombre";
			this.raza = "Cruce";
			this.peso = 0f;
			this.isVacunado = false;
			this.historia = "No tiene historia";
		}
		
		// otro constructor sobrecargado
		
		public Perro(String nombre, String raza, float peso, boolean isVacunado, String historia) {
			super();
			this.nombre = nombre;
			this.raza = raza;
			this.peso = peso;
			this.isVacunado = isVacunado;
			this.historia = historia;
		}

		public Perro(String nombre, String historia) {
			super();
			this.nombre = nombre;
			this.historia = historia;
		}

		public Perro(String nombre) {
			this();
			this.nombre = nombre;
		}
		
		//Getters y setters
		///////////////////////////////////////
		

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getRaza() {
			return raza;
		}

		public void setRaza(String raza) {
			this.raza = raza;
		}

		public float getPeso() {
			return peso;
		}

		public void setPeso(float peso) {
			if ( peso < 0 ) {
				this.peso = 0;
			}else {
				this.peso = peso;
			}	
		}

		public boolean isVacunado() {
			return isVacunado;
		}

		public void setVacunado(boolean isVacunado) {
			this.isVacunado = isVacunado;
		}

		public String getHistoria() {
			return historia;
		}

		public void setHistoria(String historia) {
			this.historia = historia;
		}
		
		

		
		

}
