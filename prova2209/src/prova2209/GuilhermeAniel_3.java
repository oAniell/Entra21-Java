package prova2209;

import java.util.Scanner;

public class GuilhermeAniel_3 {

	public static void main(String[] args) {
		/*
		 * Você foi atarefado de desenvolver um programa que realiza uma análise de
		 * dados em uma array bidimensional que representa a informação da temperatura
		 * de uma determinada semana. Cada linha corresponde a um dia da semana e cada
		 * coluna corresponde a uma hora do dia. Calcule: A média diária de um dia da
		 * semana específico. O usuário entrará com o dia da semana por extenso, por
		 * exemplo “domingo”, então você deve pesquisar na linha correspondente. A média
		 * da hora. O usuário entrará com a hora, por exemplo 15, então você deve
		 * pesquisar na coluna correspondente. Qual dia da semana teve a maior amplitude
		 * térmica
		 */
		Scanner ent = new Scanner(System.in);

		double cont = 0;
		double cont2 = 0;
		double med = 0;
		double med2 = 0;

		double matriz[][] = {
				{ 22.1, 23.5, 24.0, 23.8, 22.6, 21.9, 21.7, 22.2, 23.0, 24.1, 24.5, 24.0, 24.3, 24.4, 24.0, 24.5, 24.1,
						24.4, 24.8, 24.5, 24.3, 24.7, 24.9, 23.8 },
				{ 21.8, 22.7, 23.2, 23.9, 23.7, 22.8, 22.5, 22.1, 22.9, 24.0, 24.6, 25.1, 26.2, 27.5, 28.1, 28.6, 29.2,
						29.5, 28.9, 27.6, 26.4, 25.8, 25.1, 24.0 },
				{ 20.7, 21.0, 21.5, 22.1, 22.5, 22.7, 22.9, 23.1, 23.5, 23.9, 24.2, 24.6, 25.0, 25.3, 25.6, 25.9, 26.2,
						26.5, 26.8, 27.1, 27.4, 27.7, 27.9, 27.8 },
				{ 20.2, 20.5, 21.0, 21.4, 21.8, 22.2, 22.5, 22.8, 23.1, 23.3, 23.6, 23.9, 24.2, 24.5, 24.8, 25.1, 25.4,
						25.7, 26.0, 26.3, 26.6, 26.9, 27.1, 27.2 },
				{ 19.8, 20.0, 20.3, 20.7, 21.1, 21.4, 21.8, 22.1, 22.4, 22.7, 23.0, 23.3, 23.6, 23.9, 24.2, 24.5, 24.8,
						25.1, 25.4, 25.7, 26.0, 26.2, 26.3, 26.5 },
				{ 19.5, 19.8, 20.1, 23.5, 23.9, 24.3, 24.7, 25.1, 25.5, 26.8, 27.1, 28.4, 28.7, 29.0, 28.3, 28.6, 28.9,
						29.2, 28.5, 28.8, 28.1, 27.3, 27.5, 26.7 },
				{ 19.2, 19.5, 19.9, 20.3, 20.7, 21.1, 21.5, 21.9, 22.3, 22.7, 23.1, 23.4, 23.7, 24.0, 24.3, 24.6, 24.9,
						25.2, 25.5, 25.8, 26.1, 26.3, 26.5, 26.7 } };

		System.out.println("Digite um dia da semana:");
		String dia = ent.next();
		for (int col = 0; col < matriz[0].length; col++) {
			// A
			switch (dia) {
			case "domingo":
				cont += matriz[0][col];
				med = cont / 24;
				break;
			case "segunda":
				cont += matriz[1][col];
				med = cont / 24;
				break;
			case "terça":
				cont += matriz[2][col];
				med = cont / 24;
				break;
			case "quarta":
				cont += matriz[3][col];
				med = cont / 24;
				break;
			case "quinta":
				cont += matriz[4][col];
				med = cont / 24;
				break;
			case "sexta":
				cont += matriz[5][col];
				med = cont / 24;
				break;
			case "sabado":
				cont += matriz[6][col];
				med = cont / 24;
				break;
			}
		}
		System.out.println("A media de temperatura eh de " + med + " " + dia);
//b
		System.out.println("Digite um horario:");
		int horario = ent.nextInt();
		for (int lin = 0; lin < matriz.length; lin++) {
			cont2 += matriz[lin][horario];

		}
		med2 = cont2 / 7;
		System.out.println("A media de temperatura deste horario foi " + med2);

		int diamaioramp = 0;
		double maioramp = Integer.MIN_VALUE;

		for (int i = 0; i < matriz.length; i++) {
			double maiortemp = Integer.MIN_VALUE;
			double menortemp = Integer.MAX_VALUE;
			double amp = 0;
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] > maiortemp) {
					maiortemp = matriz[i][j];
				}
				if (matriz[i][j] < menortemp) {
					menortemp = matriz[i][j];
				}
			}
			amp = maiortemp - menortemp;
			if (amp > maioramp) {
				maioramp = amp;
				diamaioramp = i;
			}
		}
		switch (diamaioramp) {
		case 0:
			System.out.println("A maior amplitude foi Domingo");
			break;
		case 1:
			System.out.println("A maior amplitude foi segunda");
			break;
		case 2:
			System.out.println("A maior amplitude foi terça");
			break;
		case 3:
			System.out.println("A maior amplitude foi quarta");
			break;
		case 4:
			System.out.println("A maior amplitude foi quinta");
			break;
		case 5:
			System.out.println("A maior amplitude foi sexta");
			break;
		case 6:
			System.out.println("A maior amplitude foi sabado");
			break;

		}
	}

}
