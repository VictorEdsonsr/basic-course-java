package aula6Exercicios;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a letra correspondente ao turno que estuda: M - matutino, V - verpertino, N - noturno");
		
		char turno = scan.next().charAt(0);
		
		switch(turno) {
		case 'M':
			System.out.println("Bom dia!");
			break;
		
		case 'V':
			System.out.println("Boa tarde!");
			break;
			
		case 'N':
			System.out.println("Boa noite!");
			break;
			
		default:
			System.out.println("Resposta invalida");
			break;
		}

	}

}
