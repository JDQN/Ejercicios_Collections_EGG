package ejerciciosCollections.ejercicioAprendizaje04.service;

import ejerciciosCollections.ejercicioAprendizaje04.entity.Pelicula;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import static java.util.Collections.sort;

public class PeliculaService {

	Scanner leerPelicula = new Scanner(System.in).useDelimiter("\n");

	public void crearPelicula(ArrayList<Pelicula> listPelicula){

		System.out.println("Ingrese el titulo de la pelicula: ");
		String titulo = leerPelicula.next();

		System.out.println("Ingrese el nombre del director de la pelicula: ");
		String director = leerPelicula.next();

		System.out.println("Ingrese la duracion de la pelicula: ");
		int duracionPelicula = leerPelicula.nextInt();

		listPelicula.add(new Pelicula(titulo, director, duracionPelicula));

	}

	public void peliculaMayoresOrdenadas(ArrayList<Pelicula> listPelicula){

		Collections.sort(listPelicula,new Comparator<Pelicula>(){
			@Override
			public int compare(Pelicula p1, Pelicula p2){
				return new Integer(p1.getDuracionPelicula()).compareTo(new Integer(p2.getDuracionPelicula()));
			}
		});
		System.out.println("Las siguientes peliculas tienen una duracion mayor a 60 min: ");
		for(int i = 0; i < listPelicula.size(); i++){
			if(listPelicula.get(i).getDuracionPelicula() > 60){
				System.out.println("La pelicula " + listPelicula.get(i).getTitulo() + " tiene una duracion de " + listPelicula.get(i).getDuracionPelicula() + " minutos" );
			}
		}
	}


	public void peliculaMenorOrdenadas(ArrayList<Pelicula> listPelicula){
		Collections.sort(listPelicula,new Comparator<Pelicula>(){
			@Override
			public int compare(Pelicula p1, Pelicula p2){
				return new Integer(p1.getDuracionPelicula()).compareTo(new Integer(p2.getDuracionPelicula()));
			}
		});
		System.out.println("Las siguientes peliculas tienen una duracion menor a 60 min: ");
		for(int i = 0; i < listPelicula.size(); i++){
			if(listPelicula.get(i).getDuracionPelicula() < 60){
				System.out.println("La pelicula " + listPelicula.get(i).getTitulo() + " tiene una duracion de " + listPelicula.get(i).getDuracionPelicula() + " minutos" );
			}
		}
	}


	public void ordenarPorTitulo(ArrayList<Pelicula> listPelicula){
		Collections.sort(listPelicula,new Comparator<Pelicula>(){
			@Override
			public int compare(Pelicula p1, Pelicula p2){
				return new String(p1.getTitulo()).compareTo(new String(p2.getTitulo()));
			}
		});
		System.out.println("Las siguientes peliculas estan ordenadas por titulo: ");
		for(int i = 0; i < listPelicula.size(); i++){
			System.out.println("La pelicula " + listPelicula.get(i).getTitulo() + " esta ordenada por titulo de la A a la Z ");
		}
	}

	public void ordenarPorDirector(ArrayList<Pelicula> listPelicula){
		Collections.sort(listPelicula, new Comparator<Pelicula>() {
			@Override
			public int compare(Pelicula p1, Pelicula p2){
				return new String(p1.getDirector()).compareTo(new String(p2.getDirector()));
			}
		});
		System.out.println("Las siguientes peliculas estan ordenadas por director alfabeticamente: ");
		for(int i = 0; i< listPelicula.size(); i++){
			System.out.println("La lista d edorectores ordenada alfabeticamene es: " + listPelicula.get(i).getDirector());
		}
	}

}

