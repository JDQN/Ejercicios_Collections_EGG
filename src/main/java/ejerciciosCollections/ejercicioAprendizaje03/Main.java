package ejerciciosCollections.ejercicioAprendizaje03;

import ejerciciosCollections.ejercicioAprendizaje03.entity.Alumno;
import ejerciciosCollections.ejercicioAprendizaje03.service.AlumnoService;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner leer = new Scanner(System.in);
		ArrayList<Alumno> listaAlumnos = new ArrayList<>();
		AlumnoService alumnoService = new AlumnoService();
		boolean seguirEjecutando = true;

		while(seguirEjecutando){

			System.out.println("\n--- Menú ---");
			System.out.println("1. Ingresar alumno");
			System.out.println("2. Mostrar alumnos");
			System.out.println("3. Salir");
			System.out.println("Ingrese la opción deseada: ");

			int opcion = leer.nextInt();

			switch (opcion){
				case 1:
					alumnoService.ingresarAlumno(listaAlumnos);
					break;
				case 2:
					alumnoService.mostrarAlumno(listaAlumnos);
					break;
				case 3:
					seguirEjecutando = false;
					break;
				default:
					System.out.println("Opción no válida. Por favor, ingrese una opción válida.");
					break;
			}
		}

		leer.close();
		System.out.println("Fin del programa.");
	}
}
