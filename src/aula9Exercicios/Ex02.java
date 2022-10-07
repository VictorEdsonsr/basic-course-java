package aula9Exercicios;

import java.util.Random;

public class Ex02 {

	public static void main(String[] args) {
		int[][] matriz = new int[10][10];
		int maior = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;
		int col7 = 7;
		int lin5 = 5;
		
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = new Random().nextInt(100);
			}
		}
		
		for(int i = 0; i < matriz.length; i++) {
				if(matriz[lin5][i] > maior) {
					maior = matriz[lin5][i];
				}
				
				if(matriz[lin5][i] < menor) {
					menor = matriz[lin5][i];
				}

		}
		
		System.out.println("Maior linha 5 = " + maior);
		System.out.println("Menor linha 5 = " + menor);
		

		for(int i = 0; i < matriz.length; i++){
			for(int j = 0; j < matriz[i].length; j++) {
				if(matriz[i][col7] > maior) {
					maior = matriz[i][col7];
				}
				
				if(matriz[i][col7] < menor) {
					menor = matriz[i][col7];
				}
			}
		}
		
		System.out.println("Maior coluna 7 = " + maior);
		System.out.println("Menor coluna 7 = " + menor);
		
		
		
		System.out.println("Matriz = ");
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				System.out.print( matriz[i][j] + " ");
				
			}
			
			System.out.println();
		}
		
		

	}
}
