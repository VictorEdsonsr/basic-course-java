package aula12Exercicios;

public class Contador {
	private static int incrementador ;


	public Contador(){
		incrementador++;
	}
	
	public static void incrementar() {
		incrementador++;
	}
	
	public static void zerar() {
		incrementador = 0;
	}
	
	public static int retornar() {
		return incrementador;
	}
}
