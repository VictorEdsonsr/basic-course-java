package aula7Exercicios;
import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		System.out.println("Digite o numero que quer o fatorial: ");
		int num = input.nextInt();
		int fatorial = 1;
		
		for(int i = num ; i > 0; i--) {
			fatorial *= i;
			
			System.out.println(num + "!" + " --> " + i + " = " + fatorial);
		}
		
		
		
	}

}
