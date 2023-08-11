package ejerciciosCollections.ejercicioAprendizaje02;

import ejerciciosCollections.ejercicioAprendizaje02.service.RazaService;
import java.util.ArrayList;
import java.util.Scanner;

public class MainRaza {

	public static void main(String[] args) {

		Scanner leer = new Scanner(System.in);
		ArrayList<String> listaRazas = new ArrayList<String>();
		RazaService razaService = new RazaService();
		boolean seguirEjecutando = true;

		while (seguirEjecutando) {

			System.out.println("\n--- Menú ---");
			System.out.println("1. Crear raza");
			System.out.println("2. Mostrar razas");
			System.out.println("3. Eliminar razas");
			System.out.println("4. Salir");

			System.out.println("Ingrese la opción deseada: ");
			int opcion = leer.nextInt();
			leer.nextLine(); // Consume la nueva línea después de leer el número

			switch (opcion) {
				case 1:
					razaService.crearRazas();
					break;
				case 2:
					razaService.mostrarRazas();
					break;
				case 3:
					razaService.eliminarRaza();
					break;
				case 4:
					seguirEjecutando = false;
					break;
				default:
					System.out.println("Opción no válida. Por favor, ingrese una opción válida.");
					break;
			}
		}
	}
}
