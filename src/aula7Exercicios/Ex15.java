package aula7Exercicios;
import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite ate onde quer que va: ");
		int n = input.nextInt();
		
		
		int inicial = 1;
		int secundario = 1;
		int proximo = 0;
		
		System.out.println(inicial);
		System.out.println(secundario);
		
		for(int i = 0; i < n; i++) {
			proximo = inicial + secundario;
			inicial = secundario;
			secundario = proximo;
			
			System.out.println(proximo);
		}
		
		
		
	}

}
