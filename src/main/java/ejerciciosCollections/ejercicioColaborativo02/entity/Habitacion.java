package ejerciciosCollections.ejercicioColaborativo02.entity;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Habitacion {

	private int numeroHabitacion;
	private int cantidadPersonas;
	private boolean disponible;

	public Habitacion() {
	}

	public Habitacion(int numeroHabitacion, int cantidadPersonas, boolean disponible) {
		this.numeroHabitacion = numeroHabitacion;
		this.cantidadPersonas = cantidadPersonas;
		this.disponible       = disponible;
	}

}
