package aula6Exercicios;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		int contador = 0;
		
		System.out.println("Responda as perguntas: ");
		
		System.out.println("Telefonou para vitima?");
		String perguntaUm = scan.nextLine();
		
		System.out.println("Esteve no local do crime?");
		String perguntaDois = scan.nextLine();
		
		System.out.println("Mora perto da vitima?");
		String perguntaTres = scan.nextLine();
		
		System.out.println("Devia para vitima?");
		String perguntaQuatro = scan.nextLine();
		
		System.out.println("Ja trabalhou com a vitima?");
		String perguntaCinco = scan.nextLine();
		
		if(perguntaUm.equalsIgnoreCase("sim")) {
			contador += 1;
		}
		
		if(perguntaDois.equalsIgnoreCase("sim")) {
			contador += 1;
		}
		
		if(perguntaTres.equalsIgnoreCase("sim")) {
			contador += 1;
		}
		
		if(perguntaQuatro.equalsIgnoreCase("sim")) {
			contador += 1;
		}
		
		if(perguntaCinco.equalsIgnoreCase("sim")) {
			contador += 1;
		}
		
		if(contador == 5) {
			System.out.println("Culpada");
		}else if(contador >= 3 && contador <= 4) {
			System.out.println("Cumplice");
		}else if(contador <= 2){
			System.out.println("Suspeita");
		}else {
			System.out.println("Inocente");
		}
		

	}

}
