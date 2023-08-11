package ejerciciosCollections.ejercicio03.service;

import ejerciciosCollections.ejercicio03.entity.Libro;

import java.util.ArrayList;

public class LibroService {

	public ArrayList<Libro> crearLibro() {

		ArrayList<Libro> libros = new ArrayList();

		libros.add(new Libro(1, "El Quijote", "Cervantes"));
		libros.add(new Libro(2, "El Señor de los Anillos", "Tolkien"));
		libros.add(new Libro(3, "El Principito", "Saint-Exupéry"));

		Libro libro = libros.get(0);

		return libros;
	}

}
