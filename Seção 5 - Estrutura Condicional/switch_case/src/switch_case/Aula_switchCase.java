package switch_case;

import java.util.Scanner;

public class Aula_switchCase {
	
	/*
	 * Quando se tem várias opções de fluxo a serem tratadas com base no
	 * valor de uma variável, ao invés de várias estruturas if-else encadeadas,
	 * alguns preferem utilizar a estrutura switch-case.
	 * Como utilizar:
	 * 
	 * switch ( expressão ) {
	 * case valor1:
	 * 		comando1;
	 * 		comando2;
	 * 		break;
	 * 
	 * Exemplo de exercício:
	 * 
	 * Fazer um programa para ler um valor inteiro de 1 a 7 representando um
	 * dia da semana (sendo 1 = domingo, 2 = segunda, e assim por diante).
	 * Escrever na tela o dia da semana correspondente, conforme exemplos.
	 * 
	 * Entrada:			Saída:
	 * 1				Dia da semana: Domingo
	 * 4				Dia da semana: Quarta-feira
	 * 9				Dia da semana: Valor inválido
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x;
		System.out.println("Digite um número de 1 a 7: ");
		x = sc.nextInt();
		
		String dia;
		
		switch (x) {
		case 1:
			dia = "Domingo";
			break;
		case 2:
			dia = "Segunda-feira";
			break;
		case 3:
			dia = "Terça-feira";
			break;
		case 4:
			dia = "Quarta-feira";
			break;
		case 5:
			dia = "Quinta-feira";
			break;
		case 6:
			dia = "Sexta-feira";
			break;
		case 7:
			dia = "Sábado";
			break;
		default:
			dia = "Valor inválido";
			break;
		}
		
		if (x <= 7 && x > 0) {
			System.out.printf("Dia da semana correspondente: %s%n", dia);
		} else {
			System.out.println(dia);
		}
		
		sc.close();
	}
}
