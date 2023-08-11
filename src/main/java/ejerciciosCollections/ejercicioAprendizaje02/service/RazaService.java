package ejerciciosCollections.ejercicioAprendizaje02.service;

import ejerciciosCollections.ejercicioAprendizaje02.entity.Raza;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class RazaService {

	ArrayList<String> razasPerros = new ArrayList<>();
	Scanner leerRaza = new Scanner(System.in);
	String  raza;

	public void crearRazas(){

		while(true){
			System.out.println("Ingrese una raza de perro: ");
			raza = leerRaza.nextLine();
			razasPerros.add(raza);
			System.out.println("Desea agregar otra raza? (S/N)");
			String respuesta = leerRaza.nextLine();

			if(respuesta.equalsIgnoreCase("N")){
				break;
			}
		}

		System.out.println("Las razas de perros ingresadas son: ");
		for(String razaPerros : razasPerros){
			System.out.println(razaPerros);
		}
	}


	public void mostrarRazas(){
		System.out.println("Las razas de perros ingresadas son: ");
		for(String razaPerros : razasPerros){
			System.out.println(razaPerros);
		}
	}


	public void eliminarRaza(){
		System.out.println("Ingrese la raza a eliminar: ");
		String razaEliminar = leerRaza.nextLine();
		Iterator<String> iterator = razasPerros.iterator();
		boolean encontrado = false;
		while(iterator.hasNext()){
			String razaActual = iterator.next();
			if(razaActual.equalsIgnoreCase(razaEliminar)){
				iterator.remove();
				encontrado = true;
				System.out.println("La raza " + razaEliminar + " ha sido eliminada.");
			}
		}
		if(!encontrado) {
			System.out.println("La raza " + razaEliminar + " ha sido eliminada.");
		}
	}

}

