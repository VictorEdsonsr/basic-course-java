package aula5Exercicios;

import java.util.Scanner;

public class Ex007 {

	public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

        System.out.println("Digite um raio: ");
        double lado = scan.nextDouble();
        
        double area = Math.pow(lado, 2) * 2;
        	
        System.out.println("A area do quadrado e : " + area);

	}

}
