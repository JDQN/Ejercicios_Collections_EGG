package ejerciciosCollections.ejercicio00;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists {

	public static void main(String[] args) {


		List<Persona> lista = new ArrayList<Persona>();


		lista.add(new Persona(1, "Pepe", 20));
		lista.add(new Persona(2, "Juan", 30));
		lista.add(new Persona(3, "Luis", 40));


		//Recorremos las personas con un for pro indice
		System.out.println("----------For por indice----------");
		for (int i = 0; i < lista.size(); i++) {
			System.out.println("prueba: " + lista.get(i).getNombre());
		}


		//Recorremos las personas con un for each
		System.out.println("----------For each----------");
		for (Persona persona : lista) {
			System.out.println("persona: " + persona.getNombre());
		}

	}

}
