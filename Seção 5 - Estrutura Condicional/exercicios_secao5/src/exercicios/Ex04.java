package exercicios;

import java.util.Scanner;

/**
 * @author Guilherme Tantulli
 * @version 1.1
 */

public class Ex04 {
	/*
	 * Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
	 * começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int horaInicio, horaFim, duracao;
		System.out.println("Digite o horário em que o jogo começará: ");
		horaInicio = sc.nextInt();
		System.out.println("Digite o horário em que o jogo acabará: ");
		horaFim = sc.nextInt();
		
		if (horaInicio < horaFim ) {
			duracao = horaFim - horaInicio;
		} else {
			duracao = 24 - horaInicio + horaFim;
		}
		
		System.out.printf("O jogo durou %d hora(s).", duracao);
		
		sc.close();
	}
}
