package aula7Exercicios;

import java.util.Scanner;

public class Ex24 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
        
        int quantidadeClientes = 50;
      
        System.out.println("Digite o preco do pao: R$ ");
        double preco =scan.nextDouble();

        System.out.println("Panificadora pao de ontem - tabela de precos" );
        
        for(int i = 1; i <= quantidadeClientes; i++) {
        	System.out.println(i + " - " + "R$ " + (i*preco) );
        }

	}

}
