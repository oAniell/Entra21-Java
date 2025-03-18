package prova;

import java.util.Scanner;

public class GuilhermeAnielOliveira_3 {

	public static void main(String[] args) {
		// Escreva um programa onde o usuário leia altura de 10 pessoas diferentes e
		// depois calcule a média.
		Scanner ent = new Scanner(System.in);
		double aux = 0;
		for (int i = 1; i <=10; i++ ){
			System.out.println("digite a altura desejada:");
			double altura = ent.nextDouble();
			aux+=altura;
		}
		System.out.println("a media das alturas enviadas e de:" + aux / 10);

	}

}
