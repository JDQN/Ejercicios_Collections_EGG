package ejerciciosCollections.ejercicioColaborativo01.entity;


import lombok.Data;

@Data
public class Producto {

	private int id;
	private String nombreProducto;
	private String categoria;
	private double precio;
	private double cantidadInventario;

	public Producto() {
	}

	public Producto(int id, String nombreProducto, String categoria, double precio, double cantidadInventario) {
		this.id					   = id;
		this.nombreProducto     = nombreProducto;
		this.categoria          = categoria;
		this.precio             = precio;
		this.cantidadInventario = cantidadInventario;
	}


}
