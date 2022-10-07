package aula9Exercicios;
import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int[][] matriz = new int[3][3];
		int pares = 0;
		int impares = 0;
		
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				System.out.print("Digite os numeros da sua matriz --> ");
				matriz[i][j] = input.nextInt();
			
				if(matriz[i][j] % 2 == 0) {
					pares++;
				}else {
					impares++;
				}
			}
		}
		
		
		System.out.println("Matriz --> ");
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				System.out.print( matriz[i][j] + " - ");
			}
			
			System.out.println();
		}
		
		System.out.println("Quantidade de pares --> " + pares);
		System.out.println("Quantidade de impares --> " + impares);
	}

}
