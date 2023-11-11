package saida_de_dados;

import java.util.Locale;

/**
 * @author Guilherme Tantulli
 * @version 1.0
 */
public class Aula_saidaDeDados {

	public static void main(String[] args) {
		// Não há quebra de linha
		// System.out.print("Olá mundo!");

		// Há quebra de linha
		System.out.println("Olá mundo!");

		// Declaração da variável
		int y = 32;

		// Printando a variável
		System.out.println(y);

		// Variável com ponto flutuante
		double x = 10.35784;

		// Trocando o caracter de separação para o padrão americano
		Locale.setDefault(Locale.US);

		// Printando a variável com limitação de 2 e 4 casas
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);

		// Concatenando elementos com o comando de escrita PRINTLN
		System.out.println("Resultado = " + x + " metros");

		// Concatenando elementos com o comando de escrita PRINTF
		System.out.printf("Resultado = %.2f metros%n", x);

		// Juntando tudo:
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		System.out.printf("%s tem %d anos e ganha R$%.2f reais%n", nome, idade, renda);

	}

}
