package ejerciciosCollections.ejercicioAprendizaje06;

import ejerciciosCollections.ejercicioAprendizaje06.entity.Producto;
import ejerciciosCollections.ejercicioAprendizaje06.service.ProductoService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		ArrayList<Producto> productos = new ArrayList<Producto>();
		ProductoService productoService = new ProductoService();
		Scanner menu = new Scanner(System.in).useDelimiter("\n");
		boolean seguirEjecutando = true;

		while (seguirEjecutando){

			System.out.println("\n--- Menú tienda ---");
			System.out.println("1. Crear producto");
			System.out.println("2. Mostrar productos");
			System.out.println("3. Modificar precio del producto");
			System.out.println("4. Eliminar producto");
			System.out.println("5. Salir");
			int opcion = menu.nextInt();

			switch (opcion){
				case 1:
					productoService.crearProducto(productos);
					break;
				case 2:
					HashMap<String, Producto> mapaProductos = new HashMap<>();
					for (Producto producto : productos) {
						mapaProductos.put(producto.getNombreProducto(), producto);
					}
					productoService.mostrarProducto(mapaProductos);
					break;
				case 3:
					productoService.modificarPrecioProducto(productos);
					break;
				case 4:
					productoService.eliminarProducto(productos);
					break;
				case 5:
					seguirEjecutando = false;
					System.out.println("Gracias por visitarnos");
					break;
				default:
					System.out.println("Opción no válida");
					break;
		}
		}

		menu.close(); // Cerrar el objeto Scanner al finalizar
		productoService.cerrarScanner(); // Cerrar el Scanner en ProductoService
	}
}
