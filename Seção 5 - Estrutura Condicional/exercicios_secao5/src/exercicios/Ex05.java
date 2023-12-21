package exercicios;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author Guilherme Tantulli
 * @version 1.0
 */

public class Ex05 {
	/*
	 * Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
	 * seguir, calcule e mostre o valor da conta a pagar.
	 * 
	 * Código:			Especificação:			Preço:
	 * 1				Cachorro Quente			R$ 4.00
	 * 2				X-Salada				R$ 4.50
	 * 3				X-Bacon					R$ 5.00
	 * 4				Torrada Simples			R$ 2.00
	 * 5				Refrigerante			R$ 1.50
	 */
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigo, quantidade;
		double total;
		System.out.println("Digite o código do produto adquirido: ");
		codigo = sc.nextInt();
		System.out.println("Digite a quantidade: ");
		quantidade = sc.nextInt();
		
		if (codigo == 1) {
			total = 4 * quantidade; 
		} else if (codigo == 2) {
			total = 4.50 * quantidade; 
		} else if (codigo == 3) {
			total = 5 * quantidade; 
		} else if (codigo == 4) {
			total = 2 * quantidade; 
		} else {
			total = 1.50 * quantidade; 
		}
		
		System.out.printf("Total: R$ %.2f%n", total);
		
		sc.close();
	}
}
