package prova2209;

public class GuilhermeAniel_1 {

	public static void main(String[] args) {
		// Crie um programa para encontrar o maior número que pode ser criado
		// reordenando o vetor.
		// Por exemplo:
		// {1, 2, 3, 0, 4, 6}
		// Deverá ter a saída: 643210

		String result = "";

		int vetor[] = { 1, 3, 5, 7 };
		for (int j = 0; j < vetor.length; j++) {
			int maior = Integer.MIN_VALUE;
			int indmaior = 0;

			for (int i = 0; i < vetor.length; i++) {

				if (vetor[i] > maior) {
					maior = vetor[i];
					indmaior = i;
				}
			}
			result += maior + " ";
			vetor[indmaior] = -1;
		}
		System.out.println(result);
	}

}
