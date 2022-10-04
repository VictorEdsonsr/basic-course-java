package aula7Exercicios;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite os intervalos");
		int numOne = input.nextInt();
		int numTwo = input.nextInt();
		int soma = 0;
		
		for(int i = numOne, j = numTwo; i <= j; i++) {
			soma += i;
			
		}
		System.out.println("soma --> " + soma);
	}

	

}
