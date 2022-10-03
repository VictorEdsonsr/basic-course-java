package aula6Exercicios;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		System.out.println("Escreva suas duas notas parciais");
		
		double primeiraNota = scan.nextDouble();
		double segundaNota = scan.nextDouble();
		double media = (primeiraNota + segundaNota) / 2;
		
		if(media >= 10) {
			System.out.println("Aprovado com Distincao");
		}else if(media < 7) {
			System.out.println("Repovado");
		}else {
			System.out.println("Aprovado");
		}
	}

}
