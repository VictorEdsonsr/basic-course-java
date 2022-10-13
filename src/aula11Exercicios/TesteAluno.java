package aula11Exercicios;

import java.util.Scanner;

public class TesteAluno {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		System.out.print("Nome do aluno --> ");
		aluno.nome = input.next();

		System.out.print("Nome do curso --> ");
		aluno.nomeCurso = input.next();

		
		System.out.print("Numero da matricula --> ");
		aluno.numeroMatricula = input.next();
		System.out.println();
		
		for(int i = 0; i < aluno.disciplinas.length; i++) {
			System.out.print("Nome da disciplina " + (i+1) + " --> ");
			aluno.disciplinas[i] = input.next();
		}
		
		System.out.println();
		for(int i = 0; i < aluno.notas.length; i++) {
			System.out.println("Digite as notas da disciplina " + aluno.disciplinas[i] + ":");
			for(int j = 0; j < aluno.notas[i].length; j++) {
				System.out.println("Nota " + (j + 1) + " -->");
				aluno.notas[i][j] = input.nextDouble();
			}
		}
		
		for(int i = 0; i < aluno.disciplinas.length; i++) {
			if(aluno.verificarAprovacao(i)) {
				System.out.print("Sua media da disciplina de " + aluno.disciplinas[i] + " --> ");
				System.out.print(aluno.verificarMedia(i) + " aprovado");
				System.out.println();
			}else {
				System.out.print("Sua media da disciplina de " + aluno.disciplinas[i] + " --> ");
				System.out.print(aluno.verificarMedia(i) + " reprovado");
				System.out.println();
			}
		}
		
	}

}
