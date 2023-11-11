package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex06 {

	/*
	 * Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
	 * mostre:
	 * a) a área do triângulo retângulo que tem A por base e C por altura.
	 * b) a área do círculo de raio C. (pi = 3.14159)
	 * c) a área do trapézio que tem A e B por bases e C por altura.
	 * d) a área do quadrado que tem lado B.
	 * e) a área do retângulo que tem lados A e B.
	 * Exemplo:
	 * 
	 * Entrada:					Saída:
	 * 3.0 4.0 5.2				Trangulo: 7.800
	 * 							Circulo: 84.949
	 * 							Trapezio: 18.200
	 * 							Quadrado: 16.000
	 * 							Retangulo: 12.000
	 */
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B, C;
		System.out.println("Digite o valor de A: ");
		A = sc.nextDouble();
		System.out.println("Digite o valor de B: ");
		B = sc.nextDouble();
		System.out.println("Digite o valor de C: ");
		C = sc.nextDouble();
		
		//a)
		double areaTriangulo = (A * C) /2;
		System.out.printf("Triangulo: %.3f%n", areaTriangulo);
		
		//b)
		double π = 3.14159; 
		double areaCirculo = π * Math.pow(C, 2);
		System.out.printf("Circulo: %.3f%n", areaCirculo);
		
		//c)
		double areaTrapezio = ((A + B) * C) / 2 ;
		System.out.printf("Trapezio: %.3f%n", areaTrapezio);
		
		//d)
		double areaQuadrado = B * B;
		System.out.printf("Quadrado: %.3f%n", areaQuadrado);
		
		//e)
		double areaRetangulo = A * B;
		System.out.printf("Retangulo: %.3f%n", areaRetangulo);
		
		sc.close();
	}
}
