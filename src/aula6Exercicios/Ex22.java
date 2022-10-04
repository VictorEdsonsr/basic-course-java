package aula6Exercicios;

import java.util.Scanner;

public class Ex22 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quantos KG de morango vai querer? ");
		double morangoKG = scan.nextDouble();
		
		System.out.println("Quantas macas vai querer?");
		double macaKG = scan.nextDouble();
		
		double maca = 1.80;
		double morango = 2.50;
		double valorTotal = 0;
		double valorMaca = 0;
		double valorMorango = 0;

				if((morangoKG > 0 && macaKG > 0) && (morangoKG <= 5 && macaKG <= 5)) {
					valorTotal = (morango * morangoKG) + (maca * macaKG);
					valorMorango = (morango * morangoKG);
					valorMaca = (maca * macaKG);
					System.out.println("O valor do morango --> " + valorMorango);
					System.out.println("O valor da maca --> " + valorMaca);
					System.out.println("O valor total a ser pago e --> " + valorTotal);
				} else if(morangoKG > 5 && macaKG > 5){
					morango = 2.20;
					maca = 1.50;
					valorTotal = (morango * morangoKG) + (maca * macaKG);
					valorMorango = (morango * morangoKG);
					valorMaca = (maca * macaKG);
					System.out.println("O valor do morango --> " + valorMorango);
					System.out.println("O valor da maca --> " + valorMaca);
					System.out.println("O valor total a ser pago e --> " + valorTotal);
				}else {
					System.out.println("Valor invalido");
				}

				

	}

}
