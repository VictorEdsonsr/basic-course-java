package aula8Exercicios;

import java.util.Scanner;

public class Ex27 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		int[] vetorA = new int[5];
		int[] vetorB = new int[vetorA.length];

		for(int i = 0, j = vetorA.length - 1; i < vetorA.length; i++, j--) {
			System.out.print("Digite um numero para o primeiro vetor: ");
			vetorA[i] = input.nextInt();
			vetorB[j] = vetorA[i];

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
		
		
	}

}
