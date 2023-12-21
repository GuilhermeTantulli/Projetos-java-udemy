package expressoes_matematicas;

import java.util.Scanner;

/**
 * @author Guilherme Tantulli
 * @version 1.0
 */

public class Aula_estruturasCondicionais {
	
	/*
	 * Caracteres comparativos em Java:
	 * > - Maior que;
	 * < - Menor que;
	 * >= - Maior ou igual que;
	 * <= - Menor ou igual que;
	 * == Igual a;
	 * != Diferente de.
	 * 
	 * Operadores Lógicos:
	 * && - E;
	 * || - Ou;
	 * ! - Não.
	 */
	
	 public static void main(String[] args) {
		 
		 	Scanner sc = new Scanner(System.in);
		 	
		 	String nome1, nome2;
			int idade1, idade2;
			System.out.println("Digite um nome: ");
			nome1 = sc.nextLine();
			System.out.println("Digite outro nome: ");
			nome2 = sc.nextLine();
			System.out.printf("Digite a idade de %s: %n", nome1);
			idade1 = sc.nextInt();
			System.out.printf("Digite a idade de %s: %n", nome2);
			idade2 = sc.nextInt();
			
		 	//Estrutura condicional simples - mostrando na prática:
		 	
			//if (idade1 > idade2) {
			//	System.out.printf("%s é mais velho que %s", nome1, nome2);
			//}
			
			//if (idade2 > idade1) {
			//	System.out.printf("%s é mais velho que %s", nome2, nome1);
			//}
			
			//Estrutura condicional composta - mostrando na prática:
			
			if (idade1 > idade2) {
				System.out.printf("%s é mais velho que %s.", nome1, nome2);
			} else if (idade1 < idade2){
				System.out.printf("%s é mais velho que %s.", nome2, nome1);
			} else {
				System.out.printf("A idade de %s e %s é igual: %d anos.", nome1, nome2, idade1);
			}
			
			sc.close();
	}
	
}
