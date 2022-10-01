package aula5Exercicios;

import java.util.Scanner;

public class Ex013 {

	public static void main(String[] args) {
	        @SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);

	        System.out.println("Quanto ganha por hora: ");
	        double ganhoPorHora = scan.nextDouble();
	        
	        System.out.println("Quantas horas trabalha por dia: ");
	        double horasTrabalhadas = scan.nextDouble();
	        
	        double salarioBruto = (ganhoPorHora * horasTrabalhadas) * 20;
	        double IR = salarioBruto * 11 / 100;
	        double INSS = salarioBruto * 8 / 100  ;
	        double sindicato = salarioBruto * 5/100 ;
	        double salarioLiquido = salarioBruto - IR - sindicato - INSS;
	        
	        

	        	
	        System.out.println("Seu salario bruto e : " + salarioBruto);
	        System.out.println("Pagou ao IR : " + IR);
	        System.out.println("Pagou ao INSS : " + INSS);
	        System.out.println("Pagou ao sindicato : " + sindicato);
	        System.out.println("Salario liquido : " + salarioLiquido);
	}

}
