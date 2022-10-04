package aula7Exercicios;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o numero que deseja saber a tabuada: ");
		int num = input.nextInt();
		
		System.out.println("Tabuada: ");
		for(int i = 1; i <= 10; i++) {
			System.out.println(num + " x " + i + " = " + num * i);
		}

	}

}
