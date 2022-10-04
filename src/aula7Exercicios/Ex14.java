package aula7Exercicios;
import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
        int num;
        int pares = 0;
        int impares = 0;
        
        for (int i=0; i<10; i++){
            
            System.out.println("Entre com um número:");
            num = input.nextInt();
            
            if (num % 2 == 0){
                pares++;
            } else {
                impares++;
            }
        }
        
        System.out.println("Pares: " + pares);
        System.out.println("Ímpares: " + impares);
    }
	

}
