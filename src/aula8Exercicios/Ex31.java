package aula8Exercicios;

import java.util.Scanner;

public class Ex31 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		int[] vetorA = new int[5];
		
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println("Digite 5 numeros: ");
			vetorA[i] = input.nextInt();

		}
		
        for (int i=0; i<vetorA.length; i++){
            
            System.out.println("Tabuada de " + vetorA[i]);
            
            for (int j=1; j<=10; j++){
                
                System.out.println(j + " * " + vetorA[i] + " = " + (vetorA[i]*j));
            }
            
            System.out.println();
         }
		
		System.out.print("vetor A = ");
		for(int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		
	}

}
