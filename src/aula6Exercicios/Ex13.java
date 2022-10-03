package aula6Exercicios;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite de 1 a 7 para dizer o dia da semana, Ex: 1-domingo, 2-segunda... : ");
        int dia = scan.nextInt();
        
        switch(dia) {
	        case 1:
	        	System.out.println("Domingo");
	        	break;
	        case 2:
	        	System.out.println("Segunda-feira");
	        	break;
	        
	        case 3:
	        	System.out.println("Terca-feira");
	        	break;
	        
	        case 4:
	        	System.out.println("Quarta-feira");
	        	break;
	        
	        case 5:
	        	System.out.println("Quinta-feira");
	        	break;
	        
	        case 6:
	        	System.out.println("Sexta-feira");
	        	break;
	        	
	        case 7:
	        	System.out.println("Sabado");
	        	break;
	        	
	        default:
	        	System.out.println("Mensagem invalida");
	        	break;
		}
	}
}
