package aula6Exercicios;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Escreva suas duas notas parciais");
		
		int numeroUm = scan.nextInt();
		int numeroDois = scan.nextInt();
		int numeroTres = scan.nextInt();
		
		if(numeroUm > numeroDois && numeroDois > numeroTres) {
			System.out.println(numeroTres + " - " + numeroDois + " - " + numeroUm);
		}else if(numeroDois > numeroUm && numeroUm > numeroTres) {
			System.out.println(numeroDois + " - " + numeroUm + " - " + numeroTres);
		}else {
			System.out.println(numeroUm + " - " + numeroTres + " - " + numeroDois);
		}

	}

}
