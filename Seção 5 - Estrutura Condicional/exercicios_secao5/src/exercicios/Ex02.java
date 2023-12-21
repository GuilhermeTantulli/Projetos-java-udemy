package exercicios;

import java.util.Scanner;

/**
 * @author Guilherme Tantulli
 * @version 1.1
 */

public class Ex02 {

	/*
	 * Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero;
		System.out.println("Digite um número inteiro: ");
		numero = sc.nextInt();
		
		if (numero % 2 == 0) {
			System.out.printf("O número %d é PAR.", numero);
		} else {
			System.out.printf("O número %d é ÍMPAR.", numero);
		}
		
		sc.close();
	}
}
