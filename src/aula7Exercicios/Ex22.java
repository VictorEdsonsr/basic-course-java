package aula7Exercicios;

import java.util.Scanner;

public class Ex22 {

	public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
        
        System.out.println("Quantos cds sao:");
        int quantidadeCds = scan.nextInt();
      
        double valorCds;
        double cdSoma = 0;
        double media;
        
        
        for(int i = 0; i < quantidadeCds; i++) {
        	System.out.println("Valor pago em cada cd");
        	valorCds = scan.nextDouble();
        	
        	
        	cdSoma += valorCds;
        }
        
        media = cdSoma / quantidadeCds;
        
        System.out.println("O total investido e --> " + cdSoma);
        System.out.println("Sua media gasta por cada um deles e --> " + media);

	}

}
