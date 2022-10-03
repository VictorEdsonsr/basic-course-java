package aula6Exercicios;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		@SuppressWarnings({ "unused", "resource" })
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite seu salario atual: ");
		
		double salario = scan.nextDouble();
		@SuppressWarnings("unused")
		double aumento = 0;
		if(salario > 1500){
			aumento += (salario + (salario * 5/100));
			System.out.println("Seu salario vai receber aumento salario atual --> " + salario);
			System.out.println("Seu aumento foi de 5% --> " + aumento);
		}else if(salario >= 700 && salario < 1500) {
			aumento += (salario + (salario * 10/100));
			System.out.println("Seu salario vai receber aumento salario atual --> " + salario);
			System.out.println("Seu aumento foi de 10% --> " + aumento);
		}else if(salario >= 280 && salario < 700) {
			aumento += (salario + (salario * 15/100));
			System.out.println("Seu salario vai receber aumento salario atual --> " + salario);
			System.out.println("Seu aumento foi de 15% --> " + aumento);
		}else{
			aumento += (salario + (salario * 20/100));
			System.out.println("Seu salario vai receber aumento salario atual --> " + salario);
			System.out.println("Seu aumento foi de 20% --> " + aumento);
		}

	}

}
