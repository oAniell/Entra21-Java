package exe3_26_10;

import java.util.ArrayList;
import java.util.List;

public class Princp {

	public static void main(String[] args) {
	List<Animal> listaanimais = new ArrayList<>();
	listaanimais.add(new Gatoo("gato padrao", true, 7.5, true));
	listaanimais.add(new Cachorro("caramelo", false, 10, "caramelo padrao"));
	listaanimais.add(new Ave("arara", true, 1, "azul"));
	listaanimais.add(new Hamister("sla", true, 0.5, false));
	
	
	
	for (Animal animal : listaanimais) {
		System.out.println(listaanimais.toString());
	}
	}

}
