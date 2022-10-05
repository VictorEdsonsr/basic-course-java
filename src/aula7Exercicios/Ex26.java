package aula7Exercicios;
import java.util.Scanner;

public class Ex26 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.print("Fatorial de --> ");
		int num = input.nextInt();
		int fatorial = 1;
		
		System.out.print( num + "! = ");
		
		for(int i = num; i > 1; i--) {
			fatorial *= i;
			
			System.out.print(  i + " . ");
		}
		
		System.out.print( "1 = " + fatorial );
	}

}
