package aula7Exercicios;
import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
        
        System.out.println("Entre com quantas notas quer");
        int quantidade = scan.nextInt();
        double notas;
        double notaSoma = 0;

        
        
        for(int i = 0; i < quantidade; i++) {
        	System.out.println("Digite a nota");
        	notas = scan.nextDouble(); 
        	
        	notaSoma += notas;
        }
        
        System.out.println("Sua media e --> " + notaSoma/quantidade);
	}

}
