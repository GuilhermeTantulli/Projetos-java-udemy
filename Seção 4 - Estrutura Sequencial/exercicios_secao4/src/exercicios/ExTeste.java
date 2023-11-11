package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ExTeste {
	
	/*
	 * Fazer um programa para ler as medidas da largura e comprimento de um terreno
	 * retangular com uma casa decimal, bem como o valor do metro quadrado do terreno
	 * com duas casas decimais. Em seguida, o programa deve mostrar o valor da área do
	 * terreno, bem como o valor do preço do terreno, ambos com duas casas decimais,
	 * conforme exemplo.
	 * 
	 * Entrada:				Saída:
	 * 10.0					Area = 300.00
	 * 30.0					Preço = 60000.00
	 * 200.00
	 */
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double largura, comprimento, metroQuadrado;
		System.out.println("Digite a largura do seu terreno em metros: ");
		largura = sc.nextDouble();
		System.out.println("Digite o comprimento do seu terreno em metros: ");
		comprimento = sc.nextDouble();
		System.out.println("Digite o preço do metro quadrado em reais: ");
		metroQuadrado = sc.nextDouble();
		
		double area = largura * comprimento;
		double preco = area * metroQuadrado;
		
		System.out.println("=== Resultados ===");
		System.out.printf("Área = %.2f%n", area);
		System.out.printf("Preço = %.2f%n", preco);
		System.out.println("==================");
		
		sc.close();
	}
}
