package aula6Exercicios;

import java.util.Scanner;

public class Ex21 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Vai querer quantos litros? ");
		double litros = scan.nextDouble();
		
		System.out.println("G - para Gasolina ou  A - para Alcool");
		char tipo = scan.next().charAt(0);
		double alcool = 1.90;
		double gasolina = 2.50;
		double valor = 0;
		
		switch(tipo) {
			case 'G':
				if(litros > 0 && litros <= 20) {
					valor += ((gasolina - (gasolina * 4 / 100)) * litros);
					System.out.println("O valor a ser pago e --> " + valor);
				} else{
					valor += ((gasolina - (gasolina * 6 / 100)) * litros);
					System.out.println("O valor a S ser pago e --> " + valor);
				}
				break;
				
			case 'A':
				if(litros > 0 && litros <= 20) {
				valor += ((alcool - (alcool * 3 / 100)) * litros);
				System.out.println("O valor a ser pago e --> " + valor);
				} else{
					valor += ((alcool - (alcool * 5 / 100)) * litros);
					System.out.println("O valor a ser pago e --> " + valor);
				}
				break;
				
			default:
				System.out.println("Valor invalido");
				break;
		}

	}

}
