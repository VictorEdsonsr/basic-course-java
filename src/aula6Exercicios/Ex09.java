package aula6Exercicios;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		System.out.println("Escreva os numeros a serem ordenados");
		
		int numeroUm = scan.nextInt();
		int numeroDois = scan.nextInt();
		int numeroTres = scan.nextInt();
		
		if(numeroUm > numeroDois && numeroDois > numeroTres) {
			System.out.println(numeroUm + " - " + numeroDois + " - " + numeroTres);
		}else if(numeroDois > numeroUm && numeroUm > numeroTres) {
			System.out.println(numeroDois + " - " + numeroUm + " - " + numeroTres);
		}else if(numeroTres > numeroDois && numeroDois > numeroUm){
			System.out.println(numeroTres + " - " + numeroDois + " - " + numeroUm);
		}

	}

}
