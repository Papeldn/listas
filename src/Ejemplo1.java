import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Ejemplo1 {
	public static void main(String[] args) {

		List<String> lista = Arrays.asList("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo");

		System.out.println("Lista inicial: " + lista);

		System.out.println("Primer elemento: " + lista.get(0));

		System.out.println("Recorrer con bucle foreach:");
		for (String e : lista) {
			System.out.print(e + " ");
		}

		System.out.println("\nRecorrer con bucle iterador:");
		Iterator<String> it = lista.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}

		System.out.println("\nRecorrer iterator extendido:");
		ListIterator<String> li = lista.listIterator(lista.size());
		while (li.hasPrevious()) {
			System.out.print(li.previous() + " ");

		}

	}
}
