package aula12Exercicios;

public class TesteContador {

	static void obterValor() {
		System.out.println(Contador.retornar());
	}
	
	public static void main(String[] args) {
		Contador cont = new Contador();
		Contador cont2 = new Contador();
		
		cont.incrementar();
		
		obterValor();
		
		cont.incrementar();
		
		obterValor();
	}

}
