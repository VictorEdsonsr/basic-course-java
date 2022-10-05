package aula7Exercicios;
import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		System.out.println("Com quantas pessoas quer tirar a media: ");
		int numeroPessoas = input.nextInt();
		int idades;
		int soma = 0;
		double media;
		
		for(int i = 0; i < numeroPessoas; i++) {
			System.out.println("Idade numero " + (i+1) + " --> ");
			idades = input.nextInt();
			
			soma += idades;
		}
		
		media = soma / numeroPessoas;
		
		if(media > 0 && media <= 25.26) {
			System.out.println("Jovens");
		}else if(media > 25.26 && media <= 60) {
			System.out.println("Adultos");
		}else {
			System.out.println("Idosos");
		}
		
	}

}
