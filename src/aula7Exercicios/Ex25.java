package aula7Exercicios;

import java.util.Scanner;

public class Ex25 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o preco dos produto:");
		
        double produto;
        int count = 1;
        double soma = 0;
        double dinheiro;
        double troco;
        
        do {
            System.out.print("Produto " + count + " --> R$ ");
            produto =scan.nextDouble();
            
            soma += produto;
            count++;
        }while(produto != 0);

        System.out.println("Total: " + soma);
        
        System.out.print("Dinheiro --> R$ ");
        dinheiro = scan.nextDouble();
        
        troco = dinheiro - soma;
        
        System.out.print("Troco --> R$ " + troco);
	}

}
