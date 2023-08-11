package ejerciciosCollections.ejercicioAprendizaje06.entity;

import lombok.Data;

@Data
public class Producto {

	private String nombreProducto;
	private double precioProducto;

	public Producto() {
	}

	public Producto(String nombreProducto, double precioProducto) {
		this.nombreProducto = nombreProducto;
		this.precioProducto = precioProducto;
	}

}
