package ejerciciosCollections.ejercicioColaborativo02;

import ejerciciosCollections.ejercicioColaborativo02.entity.Habitacion;
import ejerciciosCollections.ejercicioColaborativo02.service.HotelService;

import java.util.List;

public class Main {

	public static void main(String[] args) {

		HotelService hotelService  = new HotelService();

		List<Habitacion> habitacionesDisponibles = hotelService.buscarHabitacion();

		if (habitacionesDisponibles.isEmpty()) {
			System.out.println("No hay habitaciones disponibles.");
		} else {
			System.out.println("Habitaciones disponibles:");
			for (Habitacion habitacion : habitacionesDisponibles) {
				System.out.println("Número de habitación: " + habitacion.getNumeroHabitacion());
			}
		}

	}

}
