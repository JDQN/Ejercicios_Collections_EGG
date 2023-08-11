package ejerciciosCollections.ejercicioAprendizaje05.entity;

import lombok.Data;

@Data
public class Pais {

	private String nombrePais;

	public Pais() {
	}
	public Pais(String nombrePais) {
		this.nombrePais = nombrePais;
	}
}
