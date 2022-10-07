package aula9Exercicios;

import java.util.Random;

public class Ex01 {

	public static void main(String[] args) {
		int[][] matriz = new int[4][4];
		int maior = 0;
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = new Random().nextInt(100);
				
				if(matriz[i][j] > maior) {
					maior = matriz[i][j];
				}
				
			}
		}
		
		
		
		System.out.println("Matriz = ");
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				System.out.print( matriz[i][j] + " ");
				
			}
			
			System.out.println();
		}
		
		System.out.println("Maior = " + maior);
		
		

	}

}
