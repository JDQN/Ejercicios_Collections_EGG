package ejerciciosCollections.ejercicioColaborativo01;

import ejerciciosCollections.ejercicioColaborativo01.entity.Producto;
import ejerciciosCollections.ejercicioColaborativo01.service.ProductoService;
import ejerciciosCollections.ejercicioColaborativo01.service.TiendaService;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	 public static void main(String[] args) {

		 Scanner             leer            = new Scanner(System.in);
		 ArrayList<Producto> listaProductos  = new ArrayList<>();
		 ProductoService     productoService = new ProductoService();
		 TiendaService 	   tiendaService   = new TiendaService();
		 boolean seguirEjecutando = true;

		 while (seguirEjecutando) {

			 System.out.println("\n--- Menú ---");
			 System.out.println("1. Crear producto");
			 System.out.println("2. Mostrar productos");
			 System.out.println("3. Modificar producto por ID");
			 System.out.println("4. Eliminar un producto por ID");
			 System.out.println("5. Comprar un producto de la Lista");
			 System.out.println("6. realizar una reposición de stock");
			 System.out.println("7. Salir");

			 System.out.print("Ingrese la opción deseada: ");

			 int opcion = leer.nextInt();

			 switch (opcion) {
				 case 1:
					 productoService.crearProducto(listaProductos);
					 break;
				 case 2:
					 productoService.mostrarProductos(listaProductos);
					 break;
				 case 3:
					 productoService.modificarProducto(listaProductos);
					 break;
				 case 4:
					 productoService.eliminarProducto(listaProductos);
					 break;
				 case 5:
					 tiendaService.ventas(listaProductos);
					 break;
				 case 6:
					 tiendaService.reposicion(listaProductos);
					 break;
				 case 7:
					 seguirEjecutando = false;
					 break;
				 default:
					 System.out.println("Opción no válida. Por favor, ingrese una opción válida.");
					 break;
			 }
		 }

		 leer.close();
		 System.out.println("¡Gracias por usar el programa!");
	 }
}

