package aula6Exercicios;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		@SuppressWarnings({ "unused", "resource" })
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite suas duas notas parciais: ");
		
		double notasOne = scan.nextDouble();
		double notasTwo = scan.nextDouble();
		
		double media = (notasOne + notasTwo)/2;
		
		if(media > 9 && media <= 10 ) {
			System.out.println("A");
		}else if(media > 7.5 && media <= 9) {
			System.out.println("B");
		}else if(media > 6 && media <= 7.5) {
			System.out.println("C");
		}else if(media > 4 && media <= 6) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}

	}

}
