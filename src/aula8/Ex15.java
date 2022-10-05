package aula8;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		int[] vetorA = new int[5];
		int impar = 0;
		int par = 0;

		
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println("Digite 5 numero");
			vetorA[i] = input.nextInt();
			
			if(vetorA[i] % 2 != 0) {
				impar++;
			}
		}
		 par = vetorA.length - impar;
		
	      double porcPar = (par * 100)/vetorA.length;
	        double porcImpar = 100 - porcPar;
	        
	        System.out.print("Vetor A = ");
	        for (int i=0; i<vetorA.length; i++){
	            System.out.print(vetorA[i] + " ");
	        }
	        System.out.println();
	        
	        System.out.println("Porcentagem Pares: " + porcPar);
	        System.out.println("Porcentagem Ímpares: " + porcImpar);
	}
}
