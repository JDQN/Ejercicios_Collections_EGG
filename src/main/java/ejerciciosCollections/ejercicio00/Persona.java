package ejerciciosCollections.ejercicio00;

import lombok.Data;

@Data
public class Persona {

	private int id;
	private String nombre;
	private int edad;


	public Persona(int id, String nombre, int edad) {
		this.id     = id;
		this.nombre = nombre;
		this.edad   = edad;
	}


}
