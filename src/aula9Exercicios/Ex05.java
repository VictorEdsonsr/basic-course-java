package aula9Exercicios;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		String[][][] agenda = new String[12][31][9];
		
		boolean sair = true;
		int opcao;
		
		
		while(sair) {
			System.out.println("Digite 1 para escrever ou alterar o compromisso");		
			System.out.println("Digite 2 para ver o compromisso");			
			System.out.println("Digite 0 para sair");
			opcao = input.nextInt();

				
			if(opcao == 1) {
				int mes = 0;
				int dia = 0;
				int hora = 0;
				
				boolean diaHoraMesValido = true;
				
					while(diaHoraMesValido) {
						System.out.println("Digite o mes");
						mes = input.nextInt();
						
						if(mes > 0 && dia <= 12) {
							diaHoraMesValido = false;
						}else {
							System.out.println("Mes invalido digite novamente.");
						}
						
						System.out.println("Digite o dia");
						dia = input.nextInt();
						
						if(dia > 0 && dia <= 31) {
							diaHoraMesValido = false;
						}else {
							System.out.println("Dia invalido digite novamente.");
						}
						
						
						System.out.println("Digite a hora");
						hora = input.nextInt();
						if(hora >= 0 && hora <= 8) {
							diaHoraMesValido = false;
						}else {
							System.out.println("Hora invalida digite novamente.");
						}
					}
					mes--;
					dia--;
					System.out.println("Digite o seu compromisso");
					agenda[mes][dia][hora] = input.next();
					
				
				
			}else if(opcao == 2) {
				int mes = 0;
				int dia = 0;
				int hora = 0;
				
				boolean diaHoraMesValido = true;
				
				while(diaHoraMesValido) {
					System.out.println("Digite o mes");
					mes = input.nextInt();
					
					if(mes > 0 && dia <= 12) {
						diaHoraMesValido = false;
					}else {
						System.out.println("Mes invalido digite novamente.");
					}
					
					System.out.println("Digite o dia");
					dia = input.nextInt();
					
					if(dia > 0 && dia <= 31) {
						diaHoraMesValido = false;
					}else {
						System.out.println("Dia invalido digite novamente.");
					}
					
					
					System.out.println("Digite a hora");
					hora = input.nextInt();
					if(hora >= 0 && hora <= 8) {
						diaHoraMesValido = false;
					}else {
						System.out.println("Hora invalida digite novamente.");
					}
				}
				mes--;
				dia--;
				System.out.println("Compromisso --> " + agenda[mes][dia][hora]);
			}else if (opcao == 0) {
				sair = false;
			}else {
				System.out.println("Opcao invalida digite novamente");
			}
			
			
		}
			
	}

}
