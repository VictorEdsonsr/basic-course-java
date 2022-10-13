package aula11Exercicios;

public class Aluno {
	String nome;
	String numeroMatricula;
	String nomeCurso;
	String[] disciplinas = new String[3];
	double[][] notas = new double[3][4];

	
	double verificarMedia(int indice) {
		double soma = 0;
		double media;
		
		for(int i = 0; i < notas[indice].length; i++) {
				soma += notas[indice][i];
		}
		
		media = soma/4;
		
		return media; 
	}
	
	boolean verificarAprovacao(int indice) {
		if(verificarMedia(indice) >= 7) {
			return true;
		}
		
		return false;
	}
	
	


}

/*Adicione	atributos	relacionados às	caracteristicas	de	
  um Aluno,como	nome,matricula,curso que está matriculado,	
  nome de 3	disciplinas	que	está cursando e	as notas	
  dessas 3 disciplinas.	
  */

/*
 Desenvolva um método para verificar se	o alunestá aprovado(nota maior ou igual a 7)	   
 em	uma	determinada	disciplina.Escreva um programa para testar essa classe, que pede	   
 as	informações	do aluno ao	usuário	e ao final informa o nome das disciplinas,	
  mostra as notas e mostre se o aluno foi aprovado o não.	   
 */