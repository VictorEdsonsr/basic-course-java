package aula5Exercicios;

import java.util.Scanner;

public class Ex006 {

	public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

        System.out.println("Digite um raio: ");
        double raio = scan.nextDouble();
        
        double area = 3.1415 * Math.pow(raio, 2);
        	
        System.out.println("A area do circulo e : " + area);
	}

}
