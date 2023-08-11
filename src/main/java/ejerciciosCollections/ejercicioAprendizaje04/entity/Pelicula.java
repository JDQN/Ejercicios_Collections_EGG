package ejerciciosCollections.ejercicioAprendizaje04.entity;

import lombok.Data;

@Data
public class Pelicula {

	private String titulo;
	private String director;
	private int duracionPelicula;

	public Pelicula() {
	}

	public Pelicula(String titulo, String director, int duracionPelicula) {
		this.titulo           = titulo;
		this.director         = director;
		this.duracionPelicula = duracionPelicula;
	}
}
