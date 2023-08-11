package ejerciciosCollections.ejercicioAprendizaje05;

import ejerciciosCollections.ejercicioAprendizaje05.entity.Pais;
import ejerciciosCollections.ejercicioAprendizaje05.service.PaisService;

import java.util.ArrayList;
import java.util.Scanner;

public class MainPais {

	public static void main(String[] args) {

		Scanner leer = new Scanner(System.in);
		ArrayList<Pais> listaPaises = new ArrayList<>();
		PaisService paisService = new PaisService();

		boolean seguirEjecutando = true;

		while(seguirEjecutando){

			System.out.println("\n--- Menú ---");
			System.out.println("1. Crear pais");
			System.out.println("2. Mostrar paises ordenados alfabeticamente de la A-Z");
			System.out.println("3. Desea buscar un pais (Nota: si el pais existe se eliminara de la lista)");
			System.out.println("4. salir y mostrar los paises ingresados");

			int opcion = leer.nextInt();

			switch (opcion){
				case 1:
					paisService.crearPais(listaPaises);
					break;
				case 2:
					//TODO: mostrar paises ordenados alfabeticamente de la A-Z
					break;
				case 3:
					paisService.eliminarPais(listaPaises);
					break;
				case 4:
					seguirEjecutando = false;
					paisService.mostrarPaisesAlSalir(listaPaises);
					System.out.println("Gracias por visitarnos");
					break;
				default:
					System.out.println("Opcion incorrecta");
					break;
			}
		}
	}
}
