package aula7Exercicios;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite a base e o expoente nessa ordem: ");
		int base = input.nextInt();
		int expoente = input.nextInt();
		int resultado = 0;
		
		for(int i = expoente, j = 1; j < expoente; j++) {
			resultado += base * i;
		}
		
		System.out.println("Resultado --> " + resultado);
	}

	

}
