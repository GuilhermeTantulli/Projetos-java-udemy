package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex02 {
	/*
	 * Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
	 * casas decimais conforme exemplos.
	 * 
	 * Entrada:				Saída:
	 *  2.00				A = 12.5664
	 *  
	 *  &
	 *  
	 * Entrada:				Saída:
	 * 100.64				A = 31819.3103
	 * 
	 * &
	 * 
	 * Entrada:				Saída:
	 * 150.00				A = 70685.7750
	 * 
	 * Considere o valor de π = 3.14159
	 * Fórmula da área: area = π . raio2
	 */
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor do raio do círculo que deseja calcular: ");
		
		double raio = sc.nextDouble();
		double π = 3.14159;
		double area = π * Math.pow(raio, 2);
		
		System.out.printf("A = %.4f%n", area);
		
		sc.close();
	}
}
