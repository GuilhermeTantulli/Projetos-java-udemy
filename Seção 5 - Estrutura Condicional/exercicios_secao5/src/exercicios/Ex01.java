package exercicios;

import java.util.Scanner;

public class Ex01 {
	/*
	 * Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero;
		System.out.println("Digite um número inteiro: ");
		numero = sc.nextInt();
		
		if (numero >= 0) {
			System.out.printf("O número %d é NAO NEGATIVO.", numero);
		} else {
			System.out.printf("O número %d é NEGATIVO.", numero);
		}
		
		sc.close();
	}
}
