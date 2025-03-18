package prova;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		/*
		 * Implemente um programa para auxiliar a revendedora QUERYCAR a localizar em
		 * seu pátio os carros com características desejadas pelo comprador. No pátio da
		 * revendedora existem N carros. Onde, cada qual está em um local específico
		 * (identificado por um número).
		 * 
		 * 
		 * 
		 *
		 */
		Scanner ent = new Scanner(System.in);
		
		
		Patio c1 = new Patio("Gol", "VW", "MMM001", "preta", 2009, 25000, 1);
		Patio c2 = new Patio("Fox", "VW", "LML002", "vermelha", 2010, 30000, 2);
		Patio c3 = new Patio("Uno", "Fiat", "MLM003", "cinza", 2011, 32000, 3);
		Patio c4 = new Patio("Fiesta", "Ford", "LLL004", "branca", 2009, 29000, 1);
		Patio c5 = new Patio("Palio", "Fiat", "KKK345", "amarelo", 2011, 26000, 1);
		
		System.out.println(c1.depreciaçao());
		System.out.println(c2.depreciaçao());
		
		double maior = Integer.MIN_VALUE;
		String aux = "";
		//A) Ao final, você deve imprimir na tela as informações do carro mais caro de um dado ano; 
		System.out.println("Digite o ano em que deseja pesquisar os valores:");
		int anoaux = ent.nextInt();
		for (Patio c : Patio.listacarros) {
			if (c.getAno() == anoaux) {
				if (c.getPreço() > maior) {
					maior = c.getPreço();
					aux = c.toString() + " é o carro mais caro deste ano.";
				}
			}
		}System.out.println(aux);
		System.out.println();
		aux = "";
		
		//B) imprimir as informações de todos os carros de uma dada marca com preço entre X e Y;
		System.out.println("Digite a marca que deseja pesquisar:");
		String marcaaux = ent.next();
		
		System.out.println("Digite o valor minimo e maximo que deseja pesquisar:");
		int preçoaux1 = ent.nextInt();
		int preçoaux2 = ent.nextInt();
		
		for (Patio c : Patio.listacarros) {
			if (c.getMarca().equalsIgnoreCase(marcaaux)) {
				
			if (c.getPreço() >= preçoaux1 && c.getPreço() <= preçoaux2) {
				aux = c.toString();
				System.out.println(aux);
			}
			}
		}System.out.println();
		aux = "";
		String aux2 = "";
		maior = Integer.MIN_VALUE;
		double menor = Integer.MAX_VALUE;
		
		//C) imprimir as informações do carro mais caro e mais barato de um determinado local da revendedora. 
		System.out.println("Digite a localização do patio que deseja pesquisar os carros:");
		int locaux = ent.nextInt();
		
		for (Patio c : Patio.listacarros) {
			if (c.getLoc() == locaux) {
				if (c.getPreço() > maior) {
					maior = c.getPreço();
					aux = c.toString() + " é o carro mais caro deste local.";
				}if (c.getPreço() < menor) {
					menor = c.getPreço();
					aux2 = c.toString() + " é o carro mais barato deste local";
				}
			}
		}System.out.println(aux);
		System.out.println(aux2);
	}

}
