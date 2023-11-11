package exercicios;

import java.util.Scanner;

public class Ex01 {
	
	/*
	 * Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
	 * mensagem explicativa, conforme exemplos:
	 * 
	 *  Entrada:				Saída:
	 *  10						Soma = 40
	 *  30
	 *  
	 *  &
	 *  
	 *  Entrada:				Saída:
	 *  -30						Soma = -20
	 *  10
	 *  
	 *  &
	 *  
	 *  Entrada:				Saída:
	 *  0						Soma = 0
	 *  0
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int algarismo1, algarismo2;
		System.out.println("Digite o primeiro algarismo inteiro: ");
		algarismo1 = sc.nextInt();
		System.out.println("Digite o segundo algarismo inteiro: ");
		algarismo2 = sc.nextInt();
		
		int soma = algarismo1 + algarismo2;
		System.out.printf("Soma = %d", soma);
		
		sc.close();
	}
}
