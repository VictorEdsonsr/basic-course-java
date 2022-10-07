package aula8Exercicios;
import java.util.Scanner;


public class Ex19 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite quantos alunos quer fazer a media: ");
		int quantidadeAlunos = input.nextInt();
		
		double[] nota1 = new double[quantidadeAlunos];
		double[] nota2 = new double[nota1.length];
		double[] result = new double[quantidadeAlunos];
		String situation;
		
			System.out.println("1-Bimestre: prova -> 1");
		for(int i = 0; i < nota1.length; i++) {
			System.out.print("Nota aluno " + (i + 1) + " --> ");
			nota1[i] = input.nextDouble();
		}
	
			System.out.println("1-Bimestre: prova -> 2");
		for(int i = 0; i < nota2.length; i++) {
			System.out.print("Nota aluno " + (i + 1) + " --> ");
			nota2[i] = input.nextDouble();
		}
			
			System.out.println("Media do bimestre");
		for(int i = 0; i < result.length; i++) {
			result[i] = (nota1[i] + nota2[i])/2;
			
			if(result[i] >= 7) {
				situation = "Aprovado";
			}else {
				situation = "Reprovado";
			}
			System.out.println("Media aluno " + (i + 1) + " --> " + result[i] + " - " + situation);
		}
		
		
	}
}
