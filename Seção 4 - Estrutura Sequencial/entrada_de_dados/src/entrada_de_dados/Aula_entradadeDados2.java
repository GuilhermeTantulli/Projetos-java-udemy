package entrada_de_dados;

import java.util.Scanner;
/**
 * @author Guilherme Tantulli
 * @version 1.0
 */
public class Aula_entradadeDados2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x;
		String s1, s2, s3;
		
		/*
		 * O comando nextLine faz com que todos os inputs(Scanners) sejam executados antes
		 * de serem armazenados em uma variável.
		 * Porém se houver alguma linha pendente como no caso abaixo, o valor de uma linha pulada (String vazio)
		 * será salvo em uma variável
		 * Para que seja resolvido, basta adicionarmos um sc.nextLine() vazio na linha após o comando
		 * e assim ele receberá essa String vazia.
		 */
		x = sc.nextInt();
		sc.nextLine();
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("DADOS DIGITADOS:");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		sc.close();
	}
}
