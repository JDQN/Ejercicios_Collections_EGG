package ejerciciosCollections.ejercicioAprendizaje04;

import ejerciciosCollections.ejercicioAprendizaje04.entity.Pelicula;
import ejerciciosCollections.ejercicioAprendizaje04.service.PeliculaService;

import java.util.ArrayList;
import java.util.Scanner;

public class MainPelicula {

	public static void main(String[] args) {

		Scanner leer = new Scanner(System.in);
		ArrayList<Pelicula> listaPeliculas = new ArrayList<>();
		PeliculaService peliculaService = new PeliculaService();
		boolean seguirEjecutando = true;

		while(seguirEjecutando){

			System.out.println("\n--- Menú ---");
			System.out.println("1. Crear pelicula");
			System.out.println("2. Mostrar peliculas mayores a una hora y ordenadas por duracion de menor a mayor");
			System.out.println("3. Mostrar peliculas menores a una hora y ordenadas por duracion de mayor a menor");
			System.out.println("4. Mostrar peliculas por titulo alfabéticamente");
			System.out.println("5. Mostrar peliculas por director alfabéticamente");
			System.out.println("6. Salir");

			int opcion = leer.nextInt();
			switch (opcion){
				case 1:
					peliculaService.crearPelicula(listaPeliculas);
					break;
				case 2:
					peliculaService.peliculaMayoresOrdenadas(listaPeliculas);
					break;
				case 3:
					peliculaService.peliculaMenorOrdenadas(listaPeliculas);
					break;
				case 4:
					peliculaService.ordenarPorTitulo(listaPeliculas);
					break;
				case 5:
					peliculaService.ordenarPorDirector(listaPeliculas);
					break;
				case 6:
					seguirEjecutando = false;
					break;
				default:
					System.out.println("Opcion incorrecta");
					break;
			}
		}
	}
}
