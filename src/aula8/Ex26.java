package aula8;

import java.util.Scanner;

public class Ex26 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		int[] vetorA = new int[5];
		char[] vetorB = new char[vetorA.length];

		for(int i = 0; i < vetorA.length; i++) {
			System.out.print("Digite um numero para o primeiro vetor: ");
			vetorA[i] = input.nextInt();
			
			if(vetorA[i] < 7) {
				vetorB[i] = 'a';
			}else if(vetorA[i] == 7){
				vetorB[i] = 'b';
			}else if(vetorA[i] > 7 && vetorA[i] < 10){
				vetorB[i] = 'c';
			}else if(vetorA[i] == 10){
				vetorB[i] = 'd';
			}else {
				vetorB[i] = 'e';
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
