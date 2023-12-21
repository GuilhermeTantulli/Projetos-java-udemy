package atribuicao_cumulativa;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author Guilherme Tantulli
 * @version 1.0
 */

public class Aula_expressoesCumulativas {
	
	/*
	 * Operadores de atribuição cumulativa:
	 * 
	 * a += b; -> a = a + b;
	 * a -= b; -> a = a - b;
	 * a *= b; -> a = a * b;
	 * a /= b; -> a = a / b;
	 * a %= b; -> a = a % b;
	 * 
	 * Exemplo de exercício:
	 * 
	 * Uma operadora de telefonia cobra R$ 50.00 por um plano básico que
	 * dá direito a 100 minutos de telefone. Cada minuto que exceder a
	 * franquia de 100 minutos custa R$ 2.00. Fazer um programa para ler a
	 * quantidade de minutos que uma pessoa consumiu, daí mostrar o valor
	 * a ser pago.
	 */
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int minutos;
		System.out.println("Digite quantos minutos foram gastos nesse mês: ");
		minutos = sc.nextInt();
		
		double conta = 50.0;
		if (minutos > 100) {
			
			// conta = conta + (minutos - 100) * 2.0;
			
			// O atribuidor cumulativo aqui é o " += " que permite reescrever a expressão acima de maneira simplificada.
			
			conta += (minutos - 100) * 2.0; 
		}
		
		System.out.printf("Total a pagar: R$ %.2f%n", conta);
		
		sc.close();
	}
}
