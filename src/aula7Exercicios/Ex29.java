package aula7Exercicios;

import java.util.Scanner;

public class Ex29 {

	public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
        
        System.out.println("Entre com um número");
        int num = scan.nextInt();
        
        boolean primo = true;
        
        
        
        for (int i=1; i<=num; i++){
            
            primo = true;
        
            for (int j=2; j<i; j++){
                if (i % j == 0){
                    primo = false;
                }
            }

            if (primo){
                System.out.println(i);
            }
        }

	}

}
