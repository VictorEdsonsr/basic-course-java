package aula8Exercicios;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		int[] vetorA = new int[5];
		int count = 0;
		
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println("Digite 5 numero");
			vetorA[i] = input.nextInt();
			
			if(vetorA[i] % 2 == 0) {
				count++;	
			}
		}
		
		System.out.print("Quantidade de pares = " + count);
	}

}
