package aula6Exercicios;
import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite um ano qualquer: ");
		int ano = scan.nextInt();
		
		if(ano % 4 == 0) {
			System.out.println("bissexto --> " + ano);
		}else {
			System.out.println("nao e um ano bissexto");
		}
	}

}
