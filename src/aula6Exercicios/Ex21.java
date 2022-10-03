package aula6Exercicios;

import java.util.Scanner;

public class Ex21 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		double litros = scan.nextDouble();
		
		double alcool = litros * 1.90;
		double gasolina = litros * 2.50;

	}

}
