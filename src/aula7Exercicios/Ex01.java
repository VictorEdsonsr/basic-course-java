package aula7Exercicios;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		boolean flag = false;
		int nota;
		do {
			System.out.println("Digite uma nota entre 0 e 10 :");
			nota = scan.nextInt();
			
			if(nota >= 0 && nota <= 10) {
				flag = false;
				System.out.println("Voce digitou " + nota);				
			}else {
				flag = true;
				System.out.println("Digite novamente");
			}			
		}while(flag);
		
		
	}

}
