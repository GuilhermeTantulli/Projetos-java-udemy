package exercicios;

import java.util.Scanner;

public class Ex03 {
	
	/*
	 * Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
	 * de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
	 * Exemplos:
	 * 
	 * Entrada:				Saída:
	 * 5					Diferença = -26
	 * 6
	 * 7
	 * 8
	 * 
	 * &
	 * 
	 * Entrada:				Saída:
	 * 5					Diferença = 86
	 * 6
	 * -7
	 * 8
	 */
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A, B, C, D;
		
		System.out.println("Digite o primeiro valor: ");
		A = sc.nextInt();
		System.out.println("Digite o segundo valor: ");
		B = sc.nextInt();
		System.out.println("Digite o terceiro valor: ");
		C = sc.nextInt();
		System.out.println("Digite o quarto valor: ");
		D = sc.nextInt();
		
		int dif = (A * B - C * D);
		
		System.out.printf("Diferença = %d", dif);
		
		sc.close();
	}
}
