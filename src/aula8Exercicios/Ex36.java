package aula8Exercicios;
import java.util.Scanner;

public class Ex36 {

    public static void main(String[] args){
        
        @SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
        
        int[] vetorA = new int[15];
        int[] vetorB = new int[vetorA.length];
        
        for (int i=0; i<vetorA.length; i++){
            
            System.out.println("Entre com o valor da posição A - " + i);
            vetorA[i] = scan.nextInt();
        }
        
        for (int i=0; i<vetorA.length; i++){
            
            vetorB[i] = 1; 
            for (int j=1; j<=vetorA[i]; j++){
                vetorB[i] *= j;
            }
        }
        
        System.out.print("Vetor A = ");
        for (int i=0; i<vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();
        
        
        System.out.print("Vetor B = ");
        for (int i=0; i<vetorA.length; i++){
            System.out.print(vetorB[i] + " ");
        }
        System.out.println();
    }  

}
