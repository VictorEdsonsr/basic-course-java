package aula8Exercicios;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		int[] vetorA = new int[15];
		int[] vetorB = new int[vetorA.length];
		
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println("Digite 15 numeros: ");
			vetorA[i] = input.nextInt();
			
			vetorB[i] = (int) Math.sqrt(vetorA[i]);
			

		}
		
		System.out.print("vetor A = ");
		for(int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		
		System.out.println();
	
		System.out.print("vetor B = ");
		for(int i = 0; i < vetorB.length; i++) {
			System.out.print(vetorB[i] + " ");
		}

	}

}
