package ejerciciosCollections.ejercicio02.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class OperadoresServices {

	public static void operateList(){

		System.out.println("----- LISTAS -----");

		ArrayList<Integer> numerosA = new ArrayList<Integer>();
		numerosA.add(10);
		numerosA.add(20);
		numerosA.add(30);

		 for(Integer numeroA : numerosA) {
			 System.out.println("Elemento: " + numeroA);
		 }

		 numerosA.remove(Integer.valueOf(30));
		System.out.println("Lista con el elemento 30 eliminado: " + numerosA);
	}


	public static void operateSet(){
		System.out.println("----- SETS O CONJUNTOS -----");
		HashSet<Integer> numerosB = new HashSet<>();
		numerosB.add(60);
		numerosB.add(70);
		numerosB.add(80);
		numerosB.add(90);
		numerosB.add(100);

		for (Integer numeroB : numerosB) {
			System.out.println("Elemento: " + numeroB);
		}

		numerosB.remove(80);
		System.out.println("Conjunto con el elemento 80 eliminado: " + numerosB);
	}



	public static void operateMap(){
		System.out.println("----- MAPAS -----");

		HashMap<Integer, String> alumnos = new HashMap<>();
		alumnos.put(1, "Juan");
		alumnos.put(2, "Pedro");
		alumnos.put(3, "Luis");
		alumnos.put(4, "Ana");
		alumnos.put(5, "Maria");

		for (Integer dni : alumnos.keySet()) {
			System.out.println("Los dni de los alumnos son: " + dni);
		}

		for (String nombre : alumnos.values()) {
			System.out.println("Los nombres de los alumnos son: " + nombre);
		}

		alumnos.remove(3);
		System.out.println("Mapas con el elemento 3 eliminado: " + alumnos);
	}

}
