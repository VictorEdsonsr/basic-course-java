package aula7Exercicios;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		boolean flag = false;
		String nome;
		int idade;
		double salario;
		char sexo;
		char estadoCivil;
		
		do {
			System.out.println("Digite seu nome: ");
			nome = scan.nextLine();
			
			System.out.println("Digite sua idade: ");
			idade = scan.nextInt();
			
			System.out.println("Quanto ganha: ");
			salario = scan.nextDouble();
			
			System.out.println("Digite seu sexo M - masculino, F - feminino: ");
			sexo = scan.next().charAt(0);
			
			System.out.println("Digite seu estado civil S - solteiro(a), C - casado(a), V - viuvo(a), D - divorciado(a)");
			estadoCivil = scan.next().charAt(0);
			
			if(nome.length() < 3) {
				flag = true;
				System.out.println("Seu nome deve ter mais de 3 caracteres");		
			}else if(idade < 18 && idade >= 150){
				flag = true;
				System.out.println("Sua idade deve estar entre 18 e 150");	
			}else if(salario < 0){
				flag = true;
				System.out.println("Seu salario nao pode ser negativo");		
			}else if((sexo != 'M' && sexo != 'm') && (sexo != 'F' && sexo != 'f')){
				flag = true;
				System.out.println("Escolha m ou f");		
			}else if((estadoCivil != 'S' && estadoCivil != 'C') && (estadoCivil != 'V' && estadoCivil != 'D')){
				flag = true;
				System.out.println("Digite seu estado civil");	
			}else{
				flag = false;
				System.out.println("Seu nome e --> " + nome);		
				System.out.println("Sua idade e --> " + idade);
				System.out.println("Seu salario e --> " + salario);	
				System.out.println("Seu sexo e --> " + sexo);	
				System.out.println("Seu estado civil e --> " + estadoCivil);	
			}				
		}while(flag);

	}

}
