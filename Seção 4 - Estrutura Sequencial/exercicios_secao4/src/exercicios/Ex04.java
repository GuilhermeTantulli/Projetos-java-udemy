package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex04 {

	/*
	 * Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
	 * hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
	 * decimais.
	 * Exemplo:
	 * 
	 * Entrada:				Saída:
	 * 25					Number = 25
	 * 100					Salary = U$ 550.00
	 * 5.50
	 */
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int id, horasTrabalhadas;
		double valorHora;
		System.out.println("Digite seu código identificador: ");
		id = sc.nextInt();
		System.out.println("Digite o total de horas trabalhadas: ");
		horasTrabalhadas = sc.nextInt();
		System.out.println("Qual o seu salário: ");
		valorHora = sc.nextDouble();
		
		System.out.printf("Number = %d%n", id);
		double salario = valorHora * horasTrabalhadas;
		System.out.printf("Salary = U$ %.2f%n", salario);
		
		sc.close();
	}
}
