package aula8Exercicios;

import java.util.Scanner;

public class Ex22 {

	public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
        
        int[] vetorA = new int[10];
        
        for (int i=0; i<vetorA.length; i++){
            System.out.println("Digite valores para o vetor A: ");
        	vetorA[i] = scan.nextInt();
        	
        	if(vetorA[i] % 2 != 0) {
        		break;
        	}
        }
        
        System.out.print("Vetor A = ");
        for (int i=0; i<vetorA.length; i++){
            System.out.print(vetorA[i] + " " );     	
        }

	}

}
