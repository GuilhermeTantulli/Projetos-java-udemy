package processamento_de_dados;

/**
 * @author Guilherme Tantulli
 * @version 1.0
 */
public class Aula_processamentoDeDados {
	public static void main(String[] args) {
		/*
		 *  Exemplo 1:
		 *  Repare que a expressão é calculada antes de o valor ser armazenado na variável: 
		 *  o valor foi calculado a partir de x e depois, foi atribuído a y que é um Inteiro.
		 */
		int x, y;
		x = 5;
		y = 2 * x;
		System.out.println(y);
		
		/*
		 * Exemplo 2:
		 * Aqui o algoritmo foi o mesmo, somente atribuído depois de calculado
		 * porém como y2 é um Double, o valor possui ponto flutuante.
		 */
		int x2;
		double y2;
		x2 = 5;
		y2 = 2 * x2;
		System.out.println(y2);
		
		/*
		 * Exemplo 3:
		 * Imagine agora um trapézio de:
		 * base menor = 6cm
		 * base maior = 8cm
		 * altura = 5cm
		 * 
		 * Calculando a área:
		 */
		double b, B, h, area;
		
		b = 6.0;
		B = 8.0;
		h = 5.0;
		
		area = (b + B) / 2.0 * h;
		
		System.out.println(area);
		
		
		/*
		 * Exemplo 4:
		 * Um exemplo de casting - No caso abaixo, como a operação matemática trata de 2 números inteiros,
		 * o resultado acaba por ser um valor inteiro, sendo assim:
		 * Devemo adicionar "(double)" dentro da variável resultado para que ele faça o CASTING do valor
		 * para um número de ponto flutuante.
		 */
		int c, d;
		double resultado;
		c = 5;
		d = 2;
		resultado = (double) c / d;
		System.out.println(resultado);
		
		
		/*
		 * Exemplo 5:
		 * Outro exemplo de casting - No caso abaixo, tentamos salvar o valor da variável f, na variável g,
		 * porém f é um valor do tipo double e b é um valor do tipo inteiro. Para que não haja perda de informação,
		 * o programa nos impede de fazer esse processo, sendo assim:
		 * Para que possamos realizar essa operação, é necessário o CASTING de "(int)" dentro da variável g, e 
		 * assim o compilador nos deixa prosseguir. 
		 */
		double f;
		int g;
		f = 5.0;
		g = (int) f;
		System.out.println(g);
				
	}
}
