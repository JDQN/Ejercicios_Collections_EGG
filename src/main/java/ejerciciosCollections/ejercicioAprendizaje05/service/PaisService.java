package ejerciciosCollections.ejercicioAprendizaje05.service;


import ejerciciosCollections.ejercicioAprendizaje05.entity.Pais;

import java.util.*;

public class PaisService {

	ArrayList<Pais> listaPaises = new ArrayList<>();
	Scanner leerPais = new Scanner(System.in).useDelimiter("\n");
	String pais;


	public void crearPais(ArrayList<Pais> listaPaises) {

		Scanner leerPais = new Scanner(System.in).useDelimiter("\n");

		Set<String> nombrePaises = new HashSet<>();

		while(true){
			System.out.println("Ingrese el nombre del país");
			String pais = leerPais.next();

			if(nombrePaises.contains(pais.toUpperCase())){
				System.out.println("El país ya existe");
			}else{
				Pais nuevoPais = new Pais(pais);
				listaPaises.add(nuevoPais);
				nombrePaises.add(pais.toUpperCase());
			}

			System.out.println("¿Desea ingresar otro país? (S/N) o (SI/NO)");
			String respuesta = leerPais.next();

			if(respuesta.equalsIgnoreCase("N")){
				break;
			}
		}
	}

	public void mostrarPaisesAlSalir(ArrayList<Pais> listaPaises){
		Set<String> nombrePaises = new HashSet<>();
		System.out.println("La lista de los países ingresados es: ");
		int contador = 0;
		for (Pais pais : listaPaises) {
			contador ++;
			System.out.println(contador + " - " + pais.getNombrePais());
		}
	}

	public void eliminarPais(ArrayList<Pais> listaPaises) {
		System.out.println("Ingrese el nombre del pais a elimiar");
		String paisEliminar = leerPais.next();
		Iterator<Pais> iterator = listaPaises.iterator();
		boolean encontrado = false;

		while(iterator.hasNext()){
			Pais pais = iterator.next();
			if(pais.getNombrePais().equalsIgnoreCase(paisEliminar)){
				iterator.remove();
				encontrado = true;
				break;
			}
		}
		if(encontrado){
			System.out.println("El pais " + paisEliminar + " ha sido eliminado con exito");
			mostrarPaisesAlSalir(listaPaises);
		}else{
			System.out.println("El pais " + paisEliminar + " no se encontro en la lista");
		}
	}


}
