package aula6Exercicios;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
	
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite os valores de a, b, c: ");
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double c = scan.nextDouble();
		
		double delta = Math.pow(b, 2) - 4 * a * c;
		double raizUm = 0;
		double raizDois = 0;
		
		if(a == 0) {
			System.out.println("Equacao nao e do segundo grau");
		}
		
		if(delta < 0) {
			System.out.println("Equacao nao possui raizes");
		}
		
		if(delta == 0) {
			System.out.println("Equacao possui apenas uma raiz --> 0");
		}
		
		if(delta > 0) {
			raizUm += (-b + Math.sqrt(delta))/2*a;
			raizDois += (-b - Math.sqrt(delta))/2*a;
			
			System.out.println("Raiz um --> " + raizUm);
			System.out.println("Raiz dois --> " + raizDois);
		}
	}

}
