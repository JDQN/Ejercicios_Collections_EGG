package ejerciciosCollections.ejercicioColaborativo02.entity;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class Reserva {

	private Habitacion habitacion;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;;

	public Reserva() {
	}

	public Reserva(Habitacion habitacion, LocalDate fechaInicio, LocalDate fechaFin) {
		this.habitacion  = habitacion;
		this.fechaInicio = fechaInicio;
		this.fechaFin    = fechaFin;
	}
}