package exercicio;

public class principal {

	public static void main(String[] args) {
		cilindro c1 = new cilindro("azul", 3, 5);

		System.out.println("O volume dele é " +c1.CalcVol());
		System.out.println("A area dele é "+ c1.CalcArea());
		System.out.println(c1.toString());
		
		
	}

}
