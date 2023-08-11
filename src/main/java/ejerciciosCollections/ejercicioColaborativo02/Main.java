package ejerciciosCollections.ejercicioColaborativo02;

import ejerciciosCollections.ejercicioColaborativo01.entity.Producto;
import ejerciciosCollections.ejercicioColaborativo02.entity.Habitacion;
import ejerciciosCollections.ejercicioColaborativo02.entity.Reserva;
import ejerciciosCollections.ejercicioColaborativo02.service.HotelService;
import ejerciciosCollections.ejercicioColaborativo02.util.Step;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner leer = new Scanner(System.in);
		ArrayList<Reserva> reserva = new ArrayList<>();
		HotelService hotelService   = new HotelService();
		boolean seguirEjecutando = true;

		while (seguirEjecutando){

			System.out.println("\n--- Menú ---");
			System.out.println("1. Validar la reserva que vas a realizar");
			System.out.println("2. Mostrar Reservas");
			System.out.println("3. Modificar reserva");
			System.out.println("4. Eliminar reserva");
			System.out.println("5. Salir");

			System.out.print("Ingrese la opción deseada: ");

			int opcion = leer.nextInt();

			switch (opcion) {
				case 1:
					hotelService.disponibilidad(reserva);
					break;
				case 2:
					//TODO: mostrar reservas
					break;
				case 3:
					//TODO: modificar reserva
					break;
				case 4:
					//TODO: eliminar reserva
					break;
				case 5:
					seguirEjecutando = false;
					break;
				default:
					System.out.println("Opción no válida. Por favor, ingrese una opción válida.");
					break;
			}

		}
		leer.close();
		System.out.println("¡Gracias por usar el programa!");
	}
}

