package aula7Exercicios;
import java.util.Scanner;


public class Ex18 {

	public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
        
        System.out.println("Entre com um número");
        int num = scan.nextInt();
        
        boolean primo = true;
        
        
        for (int i=2; i<num; i++){
            if (num % i == 0){
                System.out.println("Não é primo - divisível por " + i);
                primo = false;
                //break;
            }
        }
        
        if (primo){
            System.out.println("É número primo");
        }
		

	}

}
