package aula9Exercicios;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		int dia = 30;
		int hora = 24;
		String tarefa = null;
		
		String[][] agenda = new String[dia][hora];
		String msg;
		

		
		
		System.out.print("Deseja 'adicionar' ou 'alterar' uma tarefa? ");
		msg = input.nextLine();
		
		if(msg.equalsIgnoreCase("alterar")) {
			System.out.print("Informe o dia que deseja alterar: ");
			dia = input.nextInt();
			
			System.out.print("Informe a hora: ");
			hora = input.nextInt();
			
			System.out.println("Diga seu compromisso: ");
			tarefa = input.nextLine();
			
			System.out.println("Diga seu compromisso: ");
			tarefa = input.nextLine();
			
		}
		
		
		
		
		for(int i = 0; i < agenda.length; i++) {
			for(int j = 0; j < agenda[i].length; j++) {
				agenda[dia][hora] = tarefa;
				
				
			}
		}
			
			
			
			System.out.print(agenda[dia][hora]);
			
			
			
			
			
			
			
			
			
	}

}
