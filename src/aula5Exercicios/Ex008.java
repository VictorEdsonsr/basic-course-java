package aula5Exercicios;

import java.util.Scanner;

public class Ex008 {

	public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

        System.out.println("Quanto ganha por hora: ");
        double ganhoPorHora = scan.nextDouble();
        
        System.out.println("Quantas horas trabalha: ");
        double horasTrabalhadas = scan.nextDouble();
        
        double salario = (ganhoPorHora * horasTrabalhadas) * 20;
        	
        System.out.println("Seu salario e : " + salario);

	}

}
