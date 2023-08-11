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

	List<Alojamiento> alojamientos = new ArrayList<>();
	List<Habitacion> habitaciones = new ArrayList<>();
	List<Persona> personas = new ArrayList<>();
	List<Reserva> reservas = new ArrayList<>();


}
