package prova;

import java.util.Scanner;

public class GuilhermeAnielOliveira_4 {

	public static void main(String[] args) {
		/*
		 * Um aluno se vê com necessidade de ajuda na aula e logo tem a ideia de um
		 * algoritmo, pensando nisso, ele descreve como deve funcionar: o usuário
		 * seleciona a opção onde 1) Solicita 3 notas e calcula a média, 2) Retorna os
		 * dados do aluno em questão (informe seu nome e e-mail), 3) Solicita 5
		 * valores,verifica e retorna qual é o maior e o menor. A opção 0 encerra o
		 * programa e qualquer outra é declarada como inválida, além disso, informe
		 * quantas vezes o usuário escolheu opções válidas antes de encerrar o programa
		 * e quantas inválidas.
		 */
		Scanner ent = new Scanner(System.in);
		int cont = 0;
		System.out.println(
				"Selecione a opcao desejada: \n1- Calcular media de 3 notas \n2- Retornar seus dados \n3- Verificacao de valores");
		int opcao = ent.nextInt();
		while (opcao != 0) {
			switch (opcao) {
			case 1:cont++;
				System.out.println("Digite suas 3 notas:");
				double n1 = ent.nextDouble();
				double n2 = ent.nextDouble();
				double n3 = ent.nextDouble();
				System.out.println("Sua media é de " + (n1 + n2 + n3) / 3);
				System.out.println("Caso deseje encerrar o programa digite 0, caso contrario digite 1");
				opcao = ent.nextInt();
				break;
			case 2:cont++;
				System.out.println("Informe seu email e usuario:");
				String email = ent.next();
				String usuario = ent.next();
				System.out.println("Usuario criado! \n Seu email e " + email + "\nSeu usuario e " + usuario);
				System.out.println("Caso deseje encerrar o programa digite 0, caso contrario digite 1, 2 ou 3");
				opcao = ent.nextInt();
				break;
			case 3: cont++;
				int maior = Integer.MIN_VALUE;
				int menor = Integer.MAX_VALUE;
				for (int i = 0; i < 5; i++) {
					System.out.println("digite o valor");
					int num = ent.nextInt();

					if (num < menor) {
						menor = num;
					}
					if (num > maior) {
						maior = num;
					}
				}
				System.out.println("menor " + menor);
				System.out.println("maior " + maior);
				System.out.println("Caso deseje encerrar o programa digite 0, caso contrario digite 1, 2 ou 3");
				opcao = ent.nextInt();
			}

		}
		System.out.println("Fim do programa");
		System.out.println("Voce usou " + cont + " vezes opcoes validas.");
	}
}
