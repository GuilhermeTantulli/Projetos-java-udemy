package exercicios;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author Guilherme Tantulli
 * @version 1.0
 */

public class Ex07 {
	/*
	 * Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas
	 * de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o
	 * ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
	 * Se o ponto estiver na origem, escreva a mensagem “Origem”.
	 * Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a
	 * situação.
	 */
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x, y;
		System.out.println("Digite o valor de x: ");
		x = sc.nextDouble();
		System.out.println("Digite o valor de y: ");
		y = sc.nextDouble();
		
		if (x == 0.0 && y == 0.0) {
			System.out.println("Sua coordenada está sobre a Origem.");
		} else if ( x == 0.0 ) {
			System.out.println("Sua coordenada está sobre o Eixo X.");
		} else if ( y == 0.0 ) {
			System.out.println("Sua coordenada está sobre o Eixo Y.");
		} else if ( x > 0.0 && y > 0.0 ) {
			System.out.println("Sua coordenada se encontra no Quadrante 1.");
		} else if ( x < 0.0 && y > 0.0 ) {
			System.out.println("Sua coordenada se encontra no Quadrante 2.");
		} else if ( x < 0.0 && y < 0.0 ) {
			System.out.println("Sua coordenada se encontra no Quadrante 3.");
		} else {
			System.out.println("Sua coordenada se encontra no Quadrante 4.");
		}
		
		sc.close();
	}
	
}
