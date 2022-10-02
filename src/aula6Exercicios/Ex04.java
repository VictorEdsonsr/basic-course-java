package aula6Exercicios;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite uma letra: ");
		
		char sexo = scan.next().charAt(0);
		
		switch(sexo) {
		case 'a' :
		case 'e' :
		case 'i' :
		case 'o' :
		case 'u' :
		case 'A' :
		case 'E' :
		case 'I' :
		case 'O' :
		case 'U' :
			System.out.println("Vogal");
			break;
		
		default:
			System.out.println("Consoante");
			break;
		}

	}

}
