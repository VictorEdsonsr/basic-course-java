package aula7Exercicios;
import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite os intervalos");
		int numOne = input.nextInt();
		int numTwo = input.nextInt();
		
		
		for(int i = numOne, j = numTwo; i <= j; i++) {
			System.out.println("Intervalos --> " + i);
		}

	}

}
