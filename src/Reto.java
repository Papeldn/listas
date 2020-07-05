import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Reto {

	public static void main(String[] args) {
		// Inicialización
		Scanner sc = new Scanner(System.in);
		String[] listaArray;
		List<String> listaList;
		String elemento;
		int posicion;
		
		//Proceso
		System.out.print("Introduzca una lista de nombres con espacios: ");
		listaArray = sc.nextLine().split(" ");
		listaList = Arrays.asList(listaArray);

		System.out.print("Intruduce un nombre a buscar: ");
		elemento = sc.next();
		posicion = listaList.indexOf(elemento);
		
		//Salida
		if (posicion>=0) 
			System.out.println("El nombre está en la posición: " + posicion);
		 else 
			 System.out.println("El nombre no está en la lista");
	}
}
