package ejerciciosCollections.ejercicioAprendizaje01.service;

import java.util.ArrayList;
import java.util.Scanner;

public class RazaService {

	ArrayList<String> razasPerros = new ArrayList<String>();
	Scanner leerRaza = new Scanner(System.in);
	String  raza;


	public void crearRazas() {

		while (true) {
			System.out.println("Ingrese una raza de perro: ");
			raza = leerRaza.nextLine();
			razasPerros.add(raza);
			System.out.println("Desea agregar otra raza? (S/N)");
			String respuesta = leerRaza.nextLine();
			if (respuesta.equalsIgnoreCase("N")) {
				break;
			}
		}

		System.out.println("Las razas de perros ingresadas son: ");
		for (String razaPerros : razasPerros) {
			System.out.println(razaPerros);
		}

	}

}
