package trabalho;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		//Jogador de futebol
		
		LocalDate j1 = LocalDate.of(2024, 2, 10);
		ArrayList<String> listjog1 = new ArrayList<>();
		listjog1.add("velocidade");
		Pessoa jog1 = new Pessoa("Yuri Gudes", 25, "São Paulo", 1.77, 80);
		Futebol jogador1 = new Futebol(j1, listjog1, "Nike", 30000, 2, jog1, 10, 20, "Atacante", "Profisional", 35);
		
		LocalDate j2 = LocalDate.of(2025, 1, 22);
		ArrayList<String> listjog2 = new ArrayList<>();
		Pessoa jog2 = new Pessoa("Wesley Augusto", 17, "Rio de Janeiro", 1.70, 65);
		Futebol jogador2 = new Futebol(j2, listjog2, "Adidas", 10000, 0, jog2, 9, 18, "Ponta esquerda", "Base", 12);
		
		System.out.println(jogador1.toString());
		System.out.println(jogador2.toString());

		String aux = ent.next();
		System.out.println();
		
		//IMC
		System.out.println(jogador1.getDadosPessoais().getNome() +": " + jogador1.VerificarIMC());
		System.out.println(jogador2.getDadosPessoais().getNome() +": " + jogador2.VerificarIMC());
		
		aux = ent.next();
		System.out.println();
		
		//Titulos
		System.out.println("O jogador " + jogador2.getDadosPessoais().getNome()+ " tem um total de "+ jogador2.getTitulos() + " titulos conquistados.");
		jogador2.addTitulosConquistados(1);
		System.out.println("O jogador " + jogador2.getDadosPessoais().getNome()+ " tem um total de "+ jogador2.getTitulos() + " titulo conquistados.");
		
		aux = ent.next();
		System.out.println();
		
		//Lista de habilidades
		System.out.println("Habilidades de "+jogador1.getDadosPessoais().getNome() + jogador1.getHablilidades());
		jogador1.addHabilidade("resistencia");
		System.out.println("Habilidades de "+jogador1.getDadosPessoais().getNome() + jogador1.getHablilidades());
		
		aux = ent.next();
		System.out.println();
		
		//Promover
		System.out.println("O jogador "+  jogador2.getDadosPessoais().getNome()+ " pertence a categoria " + jogador2.getCategoria());
		jogador2.PromoverDaBase();
		System.out.println("O jogador "+  jogador2.getDadosPessoais().getNome()+ " pertence a categoria " + jogador2.getCategoria());
		jogador2.RetornarAtleta();
		System.out.println("O jogador "+  jogador2.getDadosPessoais().getNome()+ " pertence a categoria " + jogador2.getCategoria());
		
		aux = ent.next();
		System.out.println();
		
		//Adicionar gols e partidas
		System.out.println("O jogador "+ jogador1.getDadosPessoais().getNome() + " tem um total de " + jogador1.getGolsMarcados()+
		" em "+jogador1.getPartidasJogadas()+ " partidas disputadas");
		jogador1.addGols(2);
		jogador1.addPartidas(1);
		System.out.println("O jogador "+ jogador1.getDadosPessoais().getNome() + " tem um total de " + jogador1.getGolsMarcados()+
				" em "+jogador1.getPartidasJogadas()+ " partidas disputadas");
		
		aux = ent.next();
		System.out.println();
		
		//Prorrogar contrato
		System.out.println("O jogador "+ jogador1.getDadosPessoais().getNome() + " tem contrato ate a data: " + jogador1.getDataFimContrato());
		System.out.println(jogador1.ProrrogarContratoUmAno());
		System.out.println("O jogador "+ jogador2.getDadosPessoais().getNome() + " tem contrato ate a data: " + jogador2.getDataFimContrato());
		System.out.println(jogador2.ProrrogarContratoUmAno());
		
		
		//Jogador de basquete
		
		LocalDate b1 = LocalDate.of(2024, 8, 9);
		ArrayList<String> listbask1 = new ArrayList<>();
		listbask1.add("Arremesso de tres pontos");
		Pessoa bask1 = new Pessoa("Lebron Jordan", 32, "Chicago", 2.10, 92);
		Basquete jgbask1 = new Basquete(b1, listbask1, "Nike", 50000, 12, bask1, 23, 235, 50);
		
		LocalDate b2 = LocalDate.of(2024, 8, 9);
		ArrayList<String> listbask2 = new ArrayList<>();
		listbask2.add("Arremesso de tres pontos");
		Pessoa bask2 = new Pessoa("Lebron Jordan", 32, "Chicago", 2.10, 92);
		Basquete jgbask2 = new Basquete(b2, listbask2, "Nike", 50000, 12, bask1, 23, 235, 50);
	}

}
