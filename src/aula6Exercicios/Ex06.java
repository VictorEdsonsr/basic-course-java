package aula6Exercicios;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		System.out.println("Escreva suas duas notas parciais");
		
		int numeroUm = scan.nextInt();
		int numeroDois = scan.nextInt();
		int numeroTres = scan.nextInt();
		
		if(numeroUm > numeroDois && numeroUm > numeroTres) {
			System.out.println("primeiro numero " + numeroUm);
		}else if(numeroDois > numeroUm && numeroDois > numeroTres) {
			System.out.println("segundo numero " + numeroDois);
		}else {
			System.out.println("terceiro numero " + numeroTres);
		}

	}

}
