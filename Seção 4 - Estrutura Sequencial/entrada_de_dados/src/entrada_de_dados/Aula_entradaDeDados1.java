package entrada_de_dados;

import java.util.Scanner;

/**
 * @author Guilherme Tantulli
 * @version 1.0
 */
public class Aula_entradaDeDados1 {
	public static void main(String[] args) {
		/*
		 *  Scanner é declarado para que possamos utilizar nosso teclado como um dispositivo de entrada
		 *  dentro do console, na hora de rodar o programa.
		 */
		Scanner sc = new Scanner(System.in);
	
		// Para String:
		String time, nome;
		System.out.println("Digite o nome do seu time do coração: ");
		time = sc.next();
		System.out.println("Digite o seu nome: ");
		nome = sc.next();
		
		// Para int:
		int camisa;
		System.out.println("Digite o número de sua camisa: ");
		camisa = sc.nextInt();
		
		// Para double (opcional de usar Locale):
		// Locale.setDefault(Locale.US);
		double mediaGols;
		System.out.println("Digite a sua media de gols/partida: ");
		mediaGols = sc.nextDouble();
		
		// Juntando tudo:
		System.out.printf("GOOOOOL!!! do %s!!! É dele, é dele, é dele!!!%n"
				+ "%s, camisa número %d!! %n"
				+ "Assumindo a artilharia do campeonato!!!%n "
				+ "Com %.2f gols por partida", time, nome, camisa, mediaGols);
		
		// Para char (sempre adota o valor do primeiro caractere digitado):
		char x;
		x = sc.next().charAt(0);
		System.out.println("Você digitou: " + x);
		
		
		/*
		 * sc.close() é a função que usamos quando o nosso objeto sc não for mais necessário.
		 */
		sc.close();
	}
}
