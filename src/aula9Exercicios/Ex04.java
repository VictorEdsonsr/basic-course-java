package aula9Exercicios;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		String[][] agenda = new String[31][24];
		
		boolean sair = true;
		int opcao;
		
		
		while(sair) {
			System.out.println("Digite 1 para escrever ou alterar o compromisso");		
			System.out.println("Digite 2 para ver o compromisso");			
			System.out.println("Digite 0 para sair");
			opcao = input.nextInt();

				
			if(opcao == 1) {
			int dia = 0;
			int hora = 0;
			boolean diaHoraValida = true;
				
					while(diaHoraValida) {
						System.out.println("Digite o dia");
						dia = input.nextInt();
						
						if(dia > 0 && dia <= 31) {
							diaHoraValida = false;
						}else {
							System.out.println("Dia invalido digite novamente.");
						}
						
						
						System.out.println("Digite a hora");
						hora = input.nextInt();
						if(hora >= 0 && hora <= 23) {
							diaHoraValida = false;
						}else {
							System.out.println("Hora invalida digite novamente.");
						}
					}
					
					System.out.println("Digite o seu compromisso");
					agenda[dia][hora] = input.next();
					
				
				
			}else if(opcao == 2) {
				int dia = 0;
				int hora = 0;
				boolean diaHoraValida = true;
				
				while(diaHoraValida) {
					System.out.println("Digite o dia");
					dia = input.nextInt();
					
					if(dia > 0 && dia <= 31) {
						diaHoraValida = false;
					}else {
						System.out.println("Dia invalido digite novamente.");
					}
					
					
					System.out.println("Digite a hora");
					hora = input.nextInt();
					if(hora >= 0 && hora <= 23) {
						diaHoraValida = false;
					}else {
						System.out.println("Hora invalida digite novamente.");
					}
				}
				
				System.out.println("Compromisso --> " + agenda[dia][hora]);
			}else if (opcao == 0) {
				sair = false;
			}else {
				System.out.println("Opcao invalida digite novamente");
			}
			
			
		}
			
	}

}
