package aula7Exercicios;

public class Ex04 {

	public static void main(String[] args) {
		
		int populacaoA = 80_000;
		int populacaoB = 200_000;
		int tempo = 0;
		
		while(populacaoA <= populacaoB) {
			populacaoA += (populacaoA * 3/100); 
			populacaoB += (populacaoB * 1.5/100); 
			tempo++;
			
		}
		System.out.println("Anos: " + tempo);
		
	}

}
