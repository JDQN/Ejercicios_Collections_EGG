package ejerciciosCollections.ejercicioColaborativo02.entity;

import lombok.Data;

@Data
public class Alojamiento {

	public static int id = 0;
	private Reserva reserva;

	public Alojamiento() {
	}

	public Alojamiento(int id, Reserva reserva) {
		this.id      = id++;
		this.reserva = reserva;
	}
}
