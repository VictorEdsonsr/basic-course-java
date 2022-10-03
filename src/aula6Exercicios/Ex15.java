package aula6Exercicios;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite os tres lados do triangulo: ");
		
		double ladoUm = scan.nextDouble();
		double ladoDois = scan.nextDouble();
		double ladoTres = scan.nextDouble();
		
		if(ladoUm + ladoDois > ladoTres || ladoUm + ladoTres > ladoDois || ladoTres + ladoDois > ladoUm) {
			
			if(ladoUm == ladoDois && ladoDois == ladoTres) {
				System.out.println("Triangulo equilatero");
			}else if(ladoUm == ladoDois || ladoUm == ladoTres || ladoDois == ladoTres) {
				System.out.println("Triangulo isosceles");
			}else {
				System.out.println("Triangulo Escaleno");
			}
			
			
		}else {
			System.out.println("Nao e um triangulo");
		}
		
	}

}
