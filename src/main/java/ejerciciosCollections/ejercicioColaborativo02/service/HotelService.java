package ejerciciosCollections.ejercicioColaborativo02.service;

import ejerciciosCollections.ejercicioColaborativo02.entity.Alojamiento;
import ejerciciosCollections.ejercicioColaborativo02.entity.Habitacion;
import ejerciciosCollections.ejercicioColaborativo02.entity.Persona;
import ejerciciosCollections.ejercicioColaborativo02.entity.Reserva;
import ejerciciosCollections.ejercicioColaborativo02.util.Step;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HotelService extends Step {

	Scanner leer = new Scanner(System.in).useDelimiter("\n");
	List<Step> steps = new ArrayList<>();


	public List<Habitacion> buscarHabitacion() {

		System.out.println("Ingrese la cantidad de personas:");
		int cantidadPersonas = leer.nextInt();

		System.out.println("Ingrese la fecha de inicio (año-mes-día):");
		String    fechaInicioStr = leer.next();
		LocalDate fechaInicio    = LocalDate.parse(fechaInicioStr);

		System.out.println("Ingrese la fecha de fin (año-mes-día):");
		String    fechaFinStr = leer.next();
		LocalDate fechaFin    = LocalDate.parse(fechaFinStr);

		List<Habitacion> habitacionesDisponibles = new ArrayList<>();

		for (Habitacion habitacion : habitaciones) {
			if (habitacion.isDisponible() && habitacion.getCantidadPersonas() >= cantidadPersonas) {
				boolean disponible = true;
				for (Reserva reserva : reservas) {
					if (reserva.getHabitacion().equals(habitacion)) {
						if (!(fechaInicio.isAfter(reserva.getFechaFin()) || fechaFin.isBefore(reserva.getFechaInicio()))) {
							disponible = false;
							break;
						}
					}
				}
				if (disponible) {
					habitacionesDisponibles.add(habitacion);
				}
			}
		}


		if (habitacionesDisponibles.isEmpty()) {
			System.out.println("No hay habitaciones disponibles para esas fechas y cantidad de personas.");
		} else {
			System.out.println("Habitaciones disponibles:");
			for (Habitacion habitacion : habitacionesDisponibles) {
				System.out.println("Número de habit");
			}
		}

		return habitacionesDisponibles;

	 }

	}

