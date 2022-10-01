package aula5Exercicios;

import java.util.Scanner;

public class Ex010 {

	public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

        System.out.println("Digite os graus em farenheit: ");
        double grausCelsius = scan.nextDouble();
       
        
        double fahrenheit = 1.8 * grausCelsius + 32;
        	
        System.out.println("Fahrenheit : " + fahrenheit);

	}

}
