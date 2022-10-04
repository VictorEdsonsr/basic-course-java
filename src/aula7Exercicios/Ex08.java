package aula7Exercicios;
import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		int num;
		int total = 0;
		double media;
		
		
		for(int i = 0; i < 5; i++) {
			
			System.out.println("Digite um numero: ");
			num = scan.nextInt();
			total += num ;
			
		}
		
		media = total/5;
		
		System.out.println("Soma --> " + total);
		System.out.println("Media --> " + media);

	}

}
