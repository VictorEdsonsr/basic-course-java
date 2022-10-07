package aula8Exercicios;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		int[] vetorA = new int[10];
		int countSuperior = 0;

		
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println("Digite 10 idades de pessoas");
			vetorA[i] = input.nextInt();
			
			
			if(vetorA[i] > 35) {
				countSuperior++;
			}
		}
		
		
		System.out.println("Pessoas com mais de 35 anos = " + countSuperior);
	}

}
