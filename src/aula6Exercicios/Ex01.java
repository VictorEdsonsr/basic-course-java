package aula6Exercicios;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite dois numeros inteiros: ");
		int numberOne = scan.nextInt();
		int numberTwo = scan.nextInt();
		
		
		if(numberOne > numberTwo) {
			System.out.println("o primeiro numero e maior");
			return;
		} else {
			System.out.println("o segundo numero e maior");
			return;
		}
				

	}

}
