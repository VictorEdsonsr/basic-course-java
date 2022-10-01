package aula5Exercicios;

import java.util.Scanner;

public class Ex009 {

	public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

        System.out.println("Digite os graus em farenheit: ");
        double grausFarenheit = scan.nextDouble();
       
        
        double celsius = (5 * (grausFarenheit - 32) / 9);
        	
        System.out.println("Celsius : " + celsius);

	}

}
