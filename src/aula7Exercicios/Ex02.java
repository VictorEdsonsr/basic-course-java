package aula7Exercicios;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		boolean flag = false;
		String usuario;
		String senha;
		
		do {
			System.out.println("Digite seu nome de usuario: ");
			usuario = scan.nextLine();
			
			System.out.println("Digite sua senha ");
			senha = scan.nextLine();
			
			if(!senha.equalsIgnoreCase(usuario)) {
				flag = false;
				System.out.println("Seu nome de usuario e --> " + usuario);		
				System.out.println("Sua senha e --> " + senha);	
			}else {
				flag = true;
				System.out.println("A senha e o usuario nao podem ser iguais");
				System.out.println("Digite novamente");
			}			
		}while(flag);

	}

}
