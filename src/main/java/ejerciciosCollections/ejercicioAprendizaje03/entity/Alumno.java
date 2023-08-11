package ejerciciosCollections.ejercicioAprendizaje03.entity;

import lombok.Data;

@Data
public class Alumno {

	private String nombre;
	private double nota1;
	private double nota2;
	private double nota3;
	private double promedio;

	public Alumno() {
	}

	public Alumno(String nombre, double nota1, double nota2, double nota3) {
		this.nombre   = nombre;
		this.nota1    = nota1;
		this.nota2    = nota2;
		this.nota3    = nota3;
		this.promedio = promedio;
	}
}
