package aula8Exercicios;

import java.util.Scanner;

public class Ex30 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		int[] vetorA = new int[5];
		int[] vetorB = new int[vetorA.length];

		for(int i = 0; i < vetorA.length; i++) {
			System.out.print("Digite um numero para o primeiro vetor: ");
			vetorA[i] = input.nextInt();

		}
		
		int posB = 0;

		for (int i=0; i<vetorA.length; i++){
		    
		    if (vetorA[i] % 2 == 0){
		        vetorB[posB] = vetorA[i];
		        posB++;
		    }
		}

		for (int i=0; i<vetorA.length; i++){
		    
		    if (vetorA[i] % 2 != 0){
		        vetorB[posB] = vetorA[i];
		        posB++;
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
		
		
	}

}
