package aula6Exercicios;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite um ano qualquer: ");
		int numero = scan.nextInt();
		
		if(numero % 2 == 0) {
			System.out.println("par --> " + numero);
		}else {
			System.out.println("impar --> " + numero);
		}

	}

}
