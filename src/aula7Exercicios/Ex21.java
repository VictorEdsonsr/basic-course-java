package aula7Exercicios;

import java.util.Scanner;

public class Ex21 {

	public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
        
        System.out.println("Entre com quantas turmas sao");
        int quantidadeTurmas = scan.nextInt();
      
        int quantidadeAlunos;
        int turmaSoma = 0;
        double media;
        
        
        for(int i = 0; i < quantidadeTurmas; i++) {
        	System.out.println("Digite a quantidades de alunos na turma --> " + (i + 1));
        	quantidadeAlunos = scan.nextInt();
        	
        	if(quantidadeAlunos > 40) {
        		System.out.println("As tumas so podem ter 40 alunos");
        		return;
        	}
        	
        	turmaSoma += quantidadeAlunos;
        }
        
        media = turmaSoma / quantidadeTurmas;
        
        System.out.println("Sua media por turma e --> " + media);

	}

}
