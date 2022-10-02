package aula6Exercicios;

import java.util.Scanner;
 
public class Ex03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite M para masculino e F para feminino: ");
		
		char sexo = scan.next().charAt(0);
		
		if(sexo == 'm' || sexo == 'M') {
			System.out.println("Masculino");
		}else if(sexo == 'f' || sexo == 'F') {
			System.out.println("Feminino");
		}else {
			System.out.println("sexo invalido");
		}
	}

}
