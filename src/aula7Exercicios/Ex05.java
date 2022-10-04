package aula7Exercicios;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		int populacaoA;
		double taxaA;
		int populacaoB;
		double taxaB;
		int tempo = 0;
		boolean flag = false;
		
		do {
			
			System.out.println("Digite a quantidade de pessoas da populacao inicial e a taxa de crescimento: ");
			 populacaoA = scan.nextInt();
			 taxaA = scan.nextDouble();
			 	if(populacaoA < 0 && taxaA < 0) {
			 		flag = true;
			 		System.out.println("Digite novamente -- taxa deve ser maior que 0, populacao deve ser maior que zero");
			 	}
			
			 System.out.println("Digite a quantidade de pessoas da populacao final e a taxa de crescimento: ");
			 populacaoB = scan.nextInt();
			 taxaB = scan.nextDouble();
			 
			 	if(populacaoB < 0 && taxaB < 0){
			 		flag = true;
			 		System.out.println("Digite novamente -- taxa deve ser maior que 0, populacao deve ser maior que zero");
			 	}
			 	
				while(populacaoA <= populacaoB) {
					populacaoA += (populacaoA * taxaA/100); 
					populacaoB += (populacaoB * taxaB/100); 
					tempo++;
					
				}
				System.out.println("Anos: " + tempo);
			
		}while(flag);
		


	}

}
