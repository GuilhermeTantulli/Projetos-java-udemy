package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex06 {
	/*
	 * Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
	 * seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em
	 * nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.
	 */
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double valor;
		System.out.println("Digite um número: ");
		valor = sc.nextDouble();
		
		if ( valor >= 0 && valor <= 25 ) {
			System.out.printf("O número %.2f está no intervalo (0, 25)", valor);
		} else if ( valor > 25 && valor <= 50 ) {
			System.out.printf("O número %.2f está no intervalo (25, 50)", valor);
		} else if ( valor > 50 && valor <= 75 ) {
			System.out.printf("O número %.2f está no intervalo (50, 75)", valor);
		} else if ( valor > 75 && valor <= 100 ){
			System.out.printf("O número %.2f está no intervalo (75, 100)", valor);
		} else {
			System.out.println("Valor fora de intervalo");
		}
		
		sc.close();
	}
}
