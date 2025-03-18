package prova;

import java.util.Scanner;

public class GuilhermeAnielOliveira_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ent = new Scanner(System.in);
		double vdolar = 4.97;
		double dolar = 0;
		double real = 0;
		double result = 0;
		
		System.out.println(
				"Bem vindo ao conversor de dolar e real \nDigite: \n1- Converter dolar para real \n2- Converter real para dolar");
		int opcao = ent.nextInt();
		
		switch (opcao) {
		case 1:
			System.out.println("Digite o valor de dolar que voce quer converter:");
			dolar = ent.nextDouble();
			result = dolar * vdolar;
			System.out.println("Voce tem " + result + " a receber");
			break;
		case 2:
			System.out.println("Digite o valor de real que voce quer converter:");
			real = ent.nextDouble();
			result = real / vdolar;
			System.out.println("Voce tem " + result + " a receber");

		default: System.out.println("Numero invalido");
			break;
		} System.out.println("Fim do programa");
	}

}
