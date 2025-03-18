package prova2209;

import java.util.Scanner;

public class GuilhermeAniel_2 {

	public static void main(String[] args) {
		// Crie um programa Java para encontrar a maior sequência de números seguidos em
		// um vetor.
		// Por exemplo, o vetor {6, 0, 1, 5, 4, 3, 4, 5, 6, 1, 6} tem a maior sequência
		// sendo
		// {3, 4, 5, 6}.
		// Exiba essa sequência.
		// Peça para o usuário inserir os valores do vetor.
		Scanner ent = new Scanner(System.in);

		int vet[] = new int[4];

		for (int i = 0; i < vet.length; i++) {
			System.out.println("Digite um valor para o vetor:");
			vet[i] = ent.nextInt();
		}
		int possivelinicio = 0;
		int inicioseq = 0;
		int tamseq = 1;
		int tamfinal = 1;

		for (int i = 1; i < vet.length; i++) {
			if (vet[i] - 1 == vet[i - 1]) {
				tamseq++;
			} else {
				tamseq = 1;
				possivelinicio = i;
			}
			if (tamseq > tamfinal) {
				tamfinal = tamseq;
				inicioseq = possivelinicio;
			}
		}
		for (int i = 0; i < tamfinal; i++) {
			System.out.println(vet[inicioseq + i]);

		}
	}

}
