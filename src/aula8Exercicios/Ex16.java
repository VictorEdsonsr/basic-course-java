package aula8Exercicios;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		int[] vetorA = new int[10];
		int count = 0;
		int soma = 0;
		int somaSuperior = 0;
		int countSuperior = 0;
		double media;
		
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println("Digite 10 numeros");
			vetorA[i] = input.nextInt();
			
			if(vetorA[i] < 15) {
				soma += vetorA[i];
			}
			
			if(vetorA[i] == 15) {
				count++;
			}
			
			if(vetorA[i] > 15) {
				somaSuperior += vetorA[i];
				countSuperior++;
			}
		}
		
		media = somaSuperior/countSuperior;
		
		System.out.println("Media dos elementos superiores a 15 = " + media);
		System.out.println("Soma dos elementos menores que 15 = " + soma);
		System.out.println("Quantidades dos elementos iguais a 15 = " + count);
	}


}
