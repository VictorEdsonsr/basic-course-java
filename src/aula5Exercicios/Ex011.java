package aula5Exercicios;

import java.util.Scanner;

public class Ex011 {

	public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

        System.out.println("Digite dois numeros inteiros: ");
        int numberInt1 = scan.nextInt();
        int numberInt2 = scan.nextInt();
        
        System.out.println("Digite um numero real: ");
        double real = scan.nextDouble();
       
        double letterA = (numberInt1 * 2) * (numberInt2 / 2);
        double letterB = (numberInt1 * 3) + real;
        double letterC = Math.pow(real, 3);
        
        System.out.println("Produto do dobro do primeiro com metade do segundo: " + letterA);
        System.out.println("Soma do triplo do primeiro com o terceiro " + letterB);
        System.out.println("Triplo do terceiro: " + letterC);

	}

}
