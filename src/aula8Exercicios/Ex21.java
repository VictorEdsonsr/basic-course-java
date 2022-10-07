package aula8Exercicios;

public class Ex21 {

	public static void main(String[] args) {
		int[] vetorA = new int[10];
		int count0 = 0;
		int count1 = 0;
		double perc0 = 0;
		double perc1 = 0;
		
		for(int i = 0; i < vetorA.length; i++) {
			vetorA[i] = (int)Math.round(Math.random() * 1);
			
			if(vetorA[i] == 0) {
				count0++;
			}
			
			if(vetorA[i] == 1) {
				count1++;
			}
		}
		
		perc0 = (count0 * 100)/vetorA.length;
		perc1 = (count1 * 100)/vetorA.length;
		
        System.out.print("Vetor A = ");
        for (int i=0; i<vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();
        
        System.out.println("Porc 0 = " + perc0);
        System.out.println("Porc 1 = " + perc1);
		

	}

}
