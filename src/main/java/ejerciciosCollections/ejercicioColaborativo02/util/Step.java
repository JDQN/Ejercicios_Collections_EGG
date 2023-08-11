package ejerciciosCollections.ejercicioColaborativo02.util;

import ejerciciosCollections.ejercicioColaborativo02.entity.Alojamiento;
import ejerciciosCollections.ejercicioColaborativo02.entity.Habitacion;
import ejerciciosCollections.ejercicioColaborativo02.entity.Persona;
import ejerciciosCollections.ejercicioColaborativo02.entity.Reserva;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Step {

	public List<Alojamiento> alojamientos = new ArrayList<>();
	public List<Habitacion> habitaciones = new ArrayList<>();
	public List<Persona> personas = new ArrayList<>();
	public List<Reserva> reservas = new ArrayList<>();


	public Step() {
		Habitacion h1 = new Habitacion(1, 2, true);
		Habitacion h2 = new Habitacion(2, 2, true);
		Habitacion h3 = new Habitacion(3, 2, true);
		Habitacion h4 = new Habitacion(4, 2, true);
		Habitacion h5 = new Habitacion(5, 2, true);
		Habitacion h6 = new Habitacion(6, 3, true);
		Habitacion h7 = new Habitacion(7, 3, true);
		Habitacion h8 = new Habitacion(8, 3, true);
		Habitacion h9 = new Habitacion(9, 3, true);
		Habitacion h10 = new Habitacion(10, 3, true);

		habitaciones.add(h1);
		habitaciones.add(h2);
		habitaciones.add(h3);
		habitaciones.add(h4);
		habitaciones.add(h5);
		habitaciones.add(h6);
		habitaciones.add(h7);
		habitaciones.add(h8);
		habitaciones.add(h9);
		habitaciones.add(h10);
	}
}
