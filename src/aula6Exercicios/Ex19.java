package aula6Exercicios;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite dois numeros: ");
		double numeroUm = scan.nextDouble();
		double numeroDois = scan.nextDouble();
		
		System.out.println("Digite qual operacao quer fazer: ");
		char operador = scan.next().charAt(0);
		double resultado = 0;
		
		switch(operador){
			case '+':
				resultado = numeroUm + numeroDois;
				break;
				
			case '-':
				resultado = numeroUm - numeroDois;
				break;
			
			case '/':
				resultado = numeroUm / numeroDois;
				break;
				
			case '*':
				resultado = numeroUm * numeroDois;
				break;
				
			default:
				System.out.println("Valor invalido");
		}
		
		if(resultado >= 0) {
			System.out.println("positivo" );
		}else {
			System.out.println("negativo");
		}
		
		if(resultado % 2 == 0) {
			System.out.println("par --> " + resultado);
		}else {
			System.out.println("impar --> " + resultado);
		}
		

	}

}
