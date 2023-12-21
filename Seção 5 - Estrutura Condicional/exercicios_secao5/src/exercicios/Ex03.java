package exercicios;

import java.util.Scanner;

/**
 * @author Guilherme Tantulli
 * @version 1.1
 */

public class Ex03 {

	/*
	 * Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
	 * Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
	 * ordem crescente ou decrescente.
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A, B;
		System.out.println("Digite um número inteiro A: ");
		A = sc.nextInt();
		System.out.println("Agora, digite um número inteiro B: ");
		B = sc.nextInt();
		
		if (A % B == 0) {
			System.out.printf("%d é um múltiplo de %d.", A, B);
		} else if (B % A == 0) {
			System.out.printf("%d é um múltiplo de %d.", B, A);
		} else {
			System.out.println("Não são múltiplos");
		}
		
		sc.close();
	}
}
