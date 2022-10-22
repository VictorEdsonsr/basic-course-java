package aula14Exercicios;

import java.util.Scanner;

public class TesteAgenda {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		Agenda agenda = new Agenda();
		Contato[] contato = new Contato[2];
		
		System.out.print("Entre com o nome da agenda --> ");
		agenda.setNome(input.nextLine());
		
		for(int i = 0; i < contato.length; i++) {
			System.out.println("Entre com o nome do " + (i + 1) + " contato: ");

		}
		

	}

}
