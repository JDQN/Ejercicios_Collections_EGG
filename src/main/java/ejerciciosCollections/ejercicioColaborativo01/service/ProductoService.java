package ejerciciosCollections.ejercicioColaborativo01.service;

import ejerciciosCollections.ejercicioColaborativo01.entity.Producto;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ProductoService {

	Scanner leer = new Scanner(System.in).useDelimiter("\n");


	public void crearProducto(List<Producto> lista){

		System.out.println("Ingrese el ID del producto");
		int id = leer.nextInt();

		System.out.println("Ingrese el nombre del producto");
		String nombreProducto = leer.next();

		System.out.println("Ingrese la categoria del producto");
		String categoria = leer.next();

		System.out.println("Ingrese el precio del producto");
		double precio = leer.nextDouble();

		System.out.println("Ingrese la cantidad de inventario del producto");
		double cantidadInventario = leer.nextDouble();

		lista.add(new Producto(id, nombreProducto, categoria, precio, cantidadInventario));
	}


	public void mostrarProductos(ArrayList<Producto> lista){
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
	}


	public void modificarProducto(ArrayList<Producto> lista) {

		System.out.println("Ingrese el ID del producto a modificar:");

		int idModificar = leer.nextInt();

		boolean encontrado = false;

		for (Producto producto : lista) {

			if (producto.getId() == idModificar) {

				System.out.println("Producto encontrado: " + producto);
				System.out.println("Ingrese el nuevo nombre del producto:");
				producto.setNombreProducto(leer.next());

				System.out.println("Ingrese la nueva categoría del producto:");
				producto.setCategoria(leer.next());

				System.out.println("Ingrese el nuevo precio del producto:");
				producto.setPrecio(leer.nextDouble());

				System.out.println("Ingrese la nueva cantidad de inventario del producto:");
				producto.setCantidadInventario(leer.nextDouble());

				encontrado = true;
				break;
			}
		}

		if (!encontrado) {
			System.out.println("No se encontró un producto con el ID proporcionado.");
		}
	}


	public void eliminarProducto(ArrayList<Producto> lista) {

		System.out.println("Ingrese el ID del producto a eliminar:");
		int idEliminar = leer.nextInt();

		Iterator<Producto> iterator   = lista.iterator();
		boolean            encontrado = false;

		while (iterator.hasNext()) {
			Producto producto = iterator.next();
			if (producto.getId() == idEliminar) {
				iterator.remove();
				encontrado = true;
				break;
			}
		}

		if (encontrado) {
			System.out.println("Producto eliminado con éxito.");
		} else {
			System.out.println("No se encontró un producto con el ID proporcionado.");
		}
	}


}

