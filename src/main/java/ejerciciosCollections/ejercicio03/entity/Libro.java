package ejerciciosCollections.ejercicio03.entity;

import lombok.Data;

@Data
public class Libro {

	private int id;
	private String titulo;
	private String autor;


	public Libro(int id, String titulo, String autor) {
		this.id     = id;
		this.titulo = titulo;
		this.autor  = autor;
	}

}
