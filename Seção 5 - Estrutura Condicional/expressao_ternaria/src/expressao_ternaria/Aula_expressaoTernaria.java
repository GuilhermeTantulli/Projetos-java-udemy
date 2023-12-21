package expressao_ternaria;

/**
 * @author Guilherme Tantulli
 * @version 1.1
 */

public class Aula_expressaoTernaria {

	/*
	 * Estrutura opcional ao if-else quando se deseja decidir um VALOR com base em uma
	 * condição.
	 * Sintaxe:
	 * 
	 * ( condição ) ? valor_se_verdadeiro : valor_se_falso
	 * 
	 * Exemplos:
	 * 
	 * ( 2 > 4 ) ? 50 : 80  ->  80
	 * 
	 * ( 10 != 3 ) ? "Maria" : "Alex"  ->  "Maria"
	 */
	
	public static void main(String[] args) {
		
//		double preco = 34.5;
//		double desconto;
//		if (preco < 20.0) {
//			desconto = preco * 0.1;
//		} else {
//			desconto = preco * 0.05;
//		}
		
		// OU
		
		double preco = 34.5;
		
		double desconto = ( preco < 20.0 ) ? preco * 0.1 : preco * 0.05;
		
		System.out.println(desconto);
	}
}
