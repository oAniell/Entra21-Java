package simulado;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);

		Conta c1 = new Conta("Jorge", "private", 2022, 2500, "Ana");
		Conta c2 = new Conta("Luís", "Stilo", 2015, 500, "Ana");
		Conta c3 = new Conta("Claúdio", "Exclusive", 2017, 250, "Marina");
		Conta c4 = new Conta("Bruna", "Prime", 2005, 5500, "Paulo");
		Conta c5 = new Conta("Ana", "Exclusive", 2023, 240, "Paulo");

		double maior = Integer.MIN_VALUE;
		double menor = Integer.MAX_VALUE;

		String auxA = " ";
		

		//a) Informações do cliente com mais dinheiro no banco 
		for (Conta cA : Conta.listacontas) {

			if (cA.getSaldo() > maior) {
				maior = cA.getSaldo();
				auxA = cA.toString();
			}
		}
		System.out.println(auxA + " tem o maior saldo do banco");
		System.out.println();
		maior = Integer.MIN_VALUE;
		
		// b) Informações do cliente mais antigo de um dado gerente 
		System.out.println("Digite qual gerente deseja pesquisar o seu cliente mais antigo:");
		String gerent = ent.next();
		
		String auxB = " ";
		
		for (Conta cB : Conta.listacontas) {
			if (cB.getGerente().equalsIgnoreCase(gerent)) {
				if (cB.getAnocad() < menor) {
					menor = cB.getAnocad();
					auxB = cB.toString() + " é o cliente mais antigo deste gerente";
				}
			}
		}System.out.println(auxB);
		System.out.println();
		
		//c) Listar as informações de todos os clientes de um dado gerente
		System.out.println("Digite qual gerente deseja pesquisar as informaçoes de seus clientes:");
		String gerent2 = ent.next();
		
		String auxC = " ";
		
		for (Conta cC : Conta.listacontas) {
			if (cC.getGerente().equalsIgnoreCase(gerent2)) {
				auxC = cC.toString();
				System.out.println(auxC);
			}
		}System.out.println();

		//d) Informar quantos clientes um dado gerente tem
		System.out.println("Digite qual gerente deseja pesquisar o seu numero de clientes:");
		String gerent3 = ent.next();
		
		int cont = 0;
		
		for (Conta cD : Conta.listacontas) {
			if (cD.getGerente().equalsIgnoreCase(gerent3)) {
				cont++;
			}
		}System.out.println("O gerente " + gerent3 + " tem "+ cont + " clientes.");
		System.out.println();

		System.out.println("Jorge tera no ano de 2050 um total de " +c1.Rendimento(2050)+ " com o rendimento de 15% ao ano.");
	}
}