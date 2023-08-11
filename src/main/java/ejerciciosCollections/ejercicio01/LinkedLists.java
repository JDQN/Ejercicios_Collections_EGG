package ejerciciosCollections.ejercicio01;

import java.util.LinkedList;
import java.util.List;

public class LinkedLists {

	public static void main(String[] args) {

		List<Persona> lista = new LinkedList<>();

		lista.add(new Persona(1, "Pepe", 20));
		lista.add(new Persona(2, "Juan", 30));
		lista.add(new Persona(3, "Luis", 40));

		//Aqui vamos a agregar un nuevo usuario al principio de la lista
		lista.add(0, new Persona(4, "Maria", 50));

		//Aqui vamos a agregar un usuario al final de la lista
		lista.add(4, new Persona(5, "Ana", 60));


		//Recorremos el LinkedList con un forEach
		System.out.println("----------For each----------");

		for (Persona personas : lista ) {
			System.out.println("personas = " + personas.getNombre());
		}
	}
}
