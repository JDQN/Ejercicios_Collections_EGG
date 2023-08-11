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

	public void disponibilidad(ArrayList<Reserva> reservas) {
		System.out.println("Ingrese la fecha de inicio de la reserva");
		LocalDate fechaInicio = LocalDate.parse(leer.next());

		System.out.println("Ingrese la fecha de fin de la reserva");
		LocalDate fechaFin = LocalDate.parse(leer.next());

		for (Reserva r : reservas) {
			if ((fechaInicio.isEqual(r.getFechaInicio()) || fechaInicio.isAfter(r.getFechaInicio())) && (fechaInicio.isEqual(r.getFechaFin()) || fechaInicio.isBefore(r.getFechaFin()))
				 || (fechaFin.isEqual(r.getFechaInicio()) || fechaFin.isAfter(r.getFechaInicio())) && (fechaFin.isEqual(r.getFechaFin()) || fechaFin.isBefore(r.getFechaFin()))) {
				System.out.println("La habitacion no esta disponible");
				return; // Terminamos aquí si encontramos una reserva que coincide
			}
		}

		// Si llegamos a este punto, la habitación está disponible
		System.out.println("La habitacion esta disponible desea realizar la reserva? (S/N)");
		String respuesta = leer.next();

		//TODO validar respuesta (S/N)
	}


}



