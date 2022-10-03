package aula6Exercicios;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

        System.out.println("Quanto ganha por hora: ");
        double ganhoPorHora = scan.nextDouble();
        
        System.out.println("Quantas horas trabalha por dia: ");
        double horasTrabalhadas = scan.nextDouble();
        
        double salarioBruto = (ganhoPorHora * horasTrabalhadas) * 20;
        double IR = salarioBruto * 5 / 100;
        double INSS = salarioBruto * 10 / 100  ;
        double FGTS = salarioBruto * 11/100 ;
        double descontos = 0;
        double salarioLiquido = 0;
        
        if(salarioBruto > 2500) {
        	descontos += (salarioBruto * 20/100);
        	salarioLiquido += (salarioBruto - descontos);
        }else if(salarioBruto > 1500 && salarioBruto < 2500) {
        	descontos += (salarioBruto * 10/100);
        	salarioLiquido += (salarioBruto - descontos);
        }else if(salarioBruto > 900 && salarioBruto < 1500) {
        	descontos += (salarioBruto * 10/100);
        	salarioLiquido += (salarioBruto - descontos);
        }else{
        	descontos += descontos;
        	salarioLiquido += (salarioBruto - descontos);
        }
        
        System.out.println("Salario bruto: " + salarioBruto);
        System.out.println("IR: " + IR);
        System.out.println("INSS: " + INSS);
        System.out.println("FGTS: " + FGTS);
        System.out.println("Total de descontos: " + descontos);
        System.out.println("Salario Liquido: " + salarioLiquido);

	}

}
