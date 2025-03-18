package exe4_26_10;

import java.util.ArrayList;
import java.util.List;

public class princip {

	public static void main(String[] args) {
		List<transatlantico> listatransat = new ArrayList<>();
		listatransat.add(new transatlantico("xxx", "aaa", 100, 1000, 5, 10, 2023, 10));
		
		List<Lancha> listalancha = new ArrayList<>();
		listalancha.add(new Lancha("ddd", "vvv", 6, 20, 1, 0, 30));
		
	System.out.println(listalancha.get(0).planejarviagem(100));	
		System.out.println(listalancha.get(0).tempviagem(5));
		System.out.println(listalancha.get(0).verificaseg());
		
		System.out.println(listatransat.get(0).planejarviagem(50));
		
		System.out.println(listatransat.get(0).verificaseg());	
		System.out.println(listatransat.get(0).getQntbotsalvavidas());
		listatransat.get(0).addbotes(2);
		System.out.println(listatransat.get(0).getQntbotsalvavidas());
		System.out.println(listatransat.get(0).verificaseg());
		
	}

}
