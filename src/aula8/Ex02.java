package aula8;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		int[] vetorA = new int[8];
		int[] vetorB = new int[vetorA.length];
		
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println("Digite 8 numeros: ");
			vetorA[i] = input.nextInt();
			
			vetorB[i] = vetorA[i] * 2;
			

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
