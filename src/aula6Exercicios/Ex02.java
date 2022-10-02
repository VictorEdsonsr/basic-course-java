package aula6Exercicios;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um numeros: ");
		int number= scan.nextInt();
		
		
		
		if(number < 0) {
			System.out.println("numero negativo");
			return;
		} else {
			System.out.println("numero positivo");
			return;
		}

	}

}
