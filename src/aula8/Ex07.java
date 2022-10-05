package aula8;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		int[] vetorC = new int[vetorA.length];
		
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println("Digite 10 numeros para a");
			vetorA[i] = input.nextInt();
			
			System.out.println("Digite 10 numeros para b");
			vetorB[i] = input.nextInt();
			
			vetorC[i] = vetorA[i] - vetorB[i];
		}
		
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
