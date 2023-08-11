package ejerciciosCollections.ejercicioAprendizaje06.service;

import ejerciciosCollections.ejercicioAprendizaje06.entity.Producto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProductoService {

	ArrayList<Producto> productos = new ArrayList<Producto>();
	Scanner leerProducto = new Scanner(System.in).useDelimiter("\n");
	String producto;

	public void crearProducto(ArrayList<Producto> listaProducto){
		System.out.println("Introduce el nombre del producto:");
		String nombreProducto = leerProducto.next();

		System.out.println("Introduce el precio del producto:");
		double precioProducto = leerProducto.nextDouble();

		Producto producto = new Producto(nombreProducto, precioProducto);
		listaProducto.add(producto);
	}

	// Modificar el método para trabajar con un HashMap
	public void mostrarProducto(HashMap<String, Producto> mapaProductos) {
		for (Map.Entry<String, Producto> entry : mapaProductos.entrySet()) {
			String codigo = entry.getKey();
			Producto producto = entry.getValue();
			System.out.println("Código: " + codigo + " Producto: " + producto.getNombreProducto() + " Precio: " + producto.getPrecioProducto());
		}
	}


	public void modificarPrecioProducto(ArrayList<Producto> listaProducto){
		System.out.println("Introduce el nombre del producto:");
		String nombreProducto = leerProducto.next(); // Usar nextLine() para leer toda la línea

		System.out.println("Introduce el nuevo precio del producto:");
		double precioProducto = leerDouble(); // Asegurarte de leer correctamente el número

		for(Producto producto : listaProducto){
			if(producto.getNombreProducto().equals(nombreProducto)){
				producto.setPrecioProducto(precioProducto);
				System.out.println("El precio del producto " + producto.getNombreProducto() + " ha sido modificado a " + producto.getPrecioProducto());
				return;
			}
		}
		System.out.println("El producto no existe");
	}



	public void eliminarProducto(ArrayList<Producto> listaProducto){
		System.out.println("Introduce el nombre del producto:");
		String nombreProducto = leerProducto.next();

		for (Producto producto : listaProducto) {
			if (producto.getNombreProducto().equals(nombreProducto)) {
				listaProducto.remove(producto);
				System.out.println("El producto " + producto.getNombreProducto() + " ha sido eliminado");
				return;
			}
		}
		System.out.println("El producto no existe");
		}


	private double leerDouble() {
		while (true) {
			try {
				return leerProducto.nextDouble();
			} catch (java.util.InputMismatchException e) {
				leerProducto.nextLine(); // Consumir la nueva línea
				System.out.println("Por favor, introduce un número válido.");
			}
		}
	}

	public void cerrarScanner() {
		leerProducto.close();
	}

}
