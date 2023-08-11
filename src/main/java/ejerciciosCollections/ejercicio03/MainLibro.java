package ejerciciosCollections.ejercicio03;

import ejerciciosCollections.ejercicio03.entity.Libro;
import ejerciciosCollections.ejercicio03.service.LibroService;
import java.util.ArrayList;
import java.util.logging.Logger;


public class MainLibro {

	private static final Logger logger  = Logger.getLogger(MainLibro.class.getName());

	public static void main(String[] args) {

		LibroService libroService = new LibroService();

		ArrayList<Libro> listaLibros = libroService.crearLibro();

		//Aqui mostramos los libros con un forEach
		for (Libro libro : listaLibros) {
			System.out.println(libro);
			logger.info("libro" +  libro);
		}

	}

}
