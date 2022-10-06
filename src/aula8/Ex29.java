package aula8;

import java.util.Scanner;

public class Ex29 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		int[] vetorA = new int[5];
		int[] vetorB = new int[vetorA.length];
		int[] vetorC = new int[vetorA.length];

		for(int i = 0; i < vetorA.length; i++) {
			System.out.print("Digite numeros para o vetor A: ");
			vetorA[i] = input.nextInt();
			
			if(vetorA[i] % 2 == 0) {
				vetorB[i] = vetorA[i];
			}else {
				vetorC[i] = vetorA[i];
			}
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
