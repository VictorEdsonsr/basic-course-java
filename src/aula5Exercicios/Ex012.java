package aula5Exercicios;

import java.util.Scanner;

public class Ex012 {

	public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

        System.out.println("Digite sua altura: ");
        double altura = scan.nextDouble();
        
        float pesoIdeal = (float)(72.7 * altura) - 58;
        
        System.out.println("Peso ideal: " + pesoIdeal);
        

	}

}
