package ejerciciosCollections.ejercicioAprendizaje03.service;

import ejerciciosCollections.ejercicioAprendizaje03.entity.Alumno;

import java.util.ArrayList;
import java.util.Scanner;

public class AlumnoService {

	Scanner leer = new Scanner(System.in).useDelimiter("\n");

	public void ingresarAlumno(ArrayList<Alumno> lista){

		System.out.println("Ingrese el nombre del alumno: ");
		String nombre = leer.next();

		System.out.println("Ingrese la nota 1: ");
		double nota1 = leer.nextDouble();

		System.out.println("Ingrese la nota 2: ");
		double nota2 = leer.nextDouble();

		System.out.println("Ingrese la nota 3: ");
		double nota3 = leer.nextDouble();

		lista.add(new Alumno(nombre, nota1, nota2, nota3));

	}

	public void mostrarAlumno(ArrayList<Alumno> lista){
		for (int i = 0; i < lista.size(); i++) {
			double promedio = (lista.get(i).getNota1() + lista.get(i).getNota2() + lista.get(i).getNota3()) / 3;
			System.out.println("El alumno con " + lista.get(i).getNombre() + " tiene un promedio de " + lista.get(i).getPromedio());
		}
	}

}



