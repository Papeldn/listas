import java.util.Arrays;
import java.util.List;

public class Ejemplo2 {

	public static void main(String[] args) {
		  List<Integer> lista = Arrays.asList(1,2,3,4,5,1,2);

		  System.out.println("Lista inicial: " + lista);
		  
		  System.out.println("El primer '1' est� en: " + lista.indexOf(1));
		  
		  System.out.println("El �ltimo '1' est� en: " + lista.lastIndexOf(1));
		  
		  List<Integer> subLista = lista.subList(2, 5);
		  System.out.println("Sublista: [3-5]: " + subLista);
		 
	}
}
