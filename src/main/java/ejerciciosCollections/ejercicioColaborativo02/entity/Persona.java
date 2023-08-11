package ejerciciosCollections.ejercicioColaborativo02.entity;

import lombok.Data;

@Data
public class Persona {

	private String nombre;
	private String edad;
	private String dni;
	private String pais;

	public Persona() {
	}

	public Persona(String nombre, String edad, String dni, String pais) {
		this.nombre = nombre;
		this.edad   = edad;
		this.dni    = dni;
		this.pais   = pais;
	}
}
