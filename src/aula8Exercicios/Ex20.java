package aula8Exercicios;
import java.util.Scanner;

public class Ex20 {

    public static void main(String[] args){
        
        @SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
        
        double[] vetorA = new double[20];
        double cotacao;
        
        System.out.println("Entre com a cotação do dólar:");
        cotacao = scan.nextDouble();
        
        for (int i=0; i<vetorA.length; i++){
            vetorA[i] = cotacao * (i+1);
        }
        
        System.out.print("Vetor A = ");
        for (int i=0; i<vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();
    }  
}
