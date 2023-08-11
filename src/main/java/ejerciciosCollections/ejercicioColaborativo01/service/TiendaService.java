package ejerciciosCollections.ejercicioColaborativo01.service;

import ejerciciosCollections.ejercicioColaborativo01.entity.Producto;

import java.util.ArrayList;
import java.util.Scanner;

public class TiendaService {

	Scanner leer = new Scanner(System.in).useDelimiter("\n");


	public boolean ventas(ArrayList<Producto> lista) {
		System.out.println("Ingrese el nombre del producto que desea comprar:");
		String nombreProducto = leer.next();

		for (Producto producto : lista) {
			if (producto.getNombreProducto().equals(nombreProducto)) {
				System.out.println("Ingrese la cantidad que desea comprar:");
				int cantidad = leer.nextInt();
				if (producto.getCantidadInventario() >= cantidad) {
					producto.setCantidadInventario(producto.getCantidadInventario() - cantidad);
					System.out.println("Compra realizada con éxito");
					return true;
				} else {
					System.out.println("No hay suficiente stock");
					return false;
				}
			}
		}
		System.out.println("No se encontró el producto en la lista");
		return false;
	}


	public void reposicion(ArrayList<Producto> lista){
		System.out.println("Ingrese el nombre del producto que desea reponer el stock: ");
		String nombreProducto = leer.next();

		for (Producto producto : lista) {
			if(producto.getNombreProducto().equalsIgnoreCase(nombreProducto)){
				System.out.println("Producto encontrado: " + producto);
				producto.setCantidadInventario(producto.getCantidadInventario() + 1);
				System.out.println("Reposicion realizada con exito. Ahora hay " + producto.getCantidadInventario());
				return;
			}
		}
		System.out.println("El producto no se encuentra en la lista. Reposición cancelada");
	}
}
