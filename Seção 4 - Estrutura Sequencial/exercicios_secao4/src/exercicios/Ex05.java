package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex05 {
	
	/*
	 * Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
	 * código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
	 * Exemplo:
	 * 
	 * Entrada:					Saída:
	 * 12 1 5.30				Valor a pagar: R$ 15.50
	 * 16 2 5.10
	 */
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int id1, id2, qtde1, qtde2;
		double valor1, valor2;
		
		System.out.println("Digite o id da primeira peça de roupa: ");
		id1 = sc.nextInt();
		System.out.println("Digite a quantidade da primeira peça de roupa: ");
		qtde1 = sc.nextInt();
		System.out.println("Digite o valor unitário da primeira peça de roupa");
		valor1 = sc.nextDouble();
		
		System.out.println("Digite o id da segunda peça de roupa: ");
		id2 = sc.nextInt();
		System.out.println("Digite a quantidade da segunda peça de roupa: ");
		qtde2 = sc.nextInt();
		System.out.println("Digite o valor unitário da segunda peça de roupa");
		valor2 = sc.nextDouble();
		
		double total = (qtde1 * valor1) + (qtde2  * valor2);
		System.out.printf("Valor a pagar: %.2f%n", total);
		
		sc.close();
	}
}
