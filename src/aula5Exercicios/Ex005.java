package aula5Exercicios;

import java.util.Scanner;

public class Ex005 {

	public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite os metros: ");
        double metros = scan.nextDouble();
        
        double conversion = 100 * metros;
        
        System.out.println("conversao: " + conversion);

	}

}
