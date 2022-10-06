package aula8;

import java.util.Scanner;

public class Ex28 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		int[] vetorA = new int[5];
		int[] vetorB = new int[vetorA.length];
		int[] vetorC = new int[10];

		for(int i = 0; i < vetorA.length; i++) {
			System.out.print("Digite numeros para o vetor A: ");
			vetorA[i] = input.nextInt();
			
			vetorC[i] = vetorA[i];
		}
		
		for(int i = 0; i < vetorB.length; i++) {
			System.out.print("Digite numeros para o vetor B: ");
			vetorB[i] = input.nextInt();
			
			
			
				vetorC[vetorA.length + i] = vetorB[i];
			
		}
		
		System.out.println();
		
		System.out.print("Vetor A = ");
		for(int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		
		System.out.println();
		
		System.out.print("Vetor B = ");
		for(int i = 0; i < vetorB.length; i++) {
			System.out.print(vetorB[i] + " ");
		}
		
		System.out.println();
		
		System.out.print("Vetor C = ");
		for(int i = 0; i < vetorC.length; i++) {
			System.out.print(vetorC[i] + " ");
		}
		
	}

}
