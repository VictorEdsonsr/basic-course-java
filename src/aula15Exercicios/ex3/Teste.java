package aula15Exercicios.ex3;

public class Teste {

	public static void main(String[] args) {
		Animal camelo = new Animal();
		Peixe tubarao = new Peixe();
		Mamifero ursoDoCanada = new Mamifero();
		
		camelo.setNome("camelo");
		camelo.setComprimento(150.0);
		camelo.setPatas(4);
		camelo.setAmbiente("Terra");
		camelo.setCor("amarelo");
		camelo.setVelocidade(2.0);
		
		
		tubarao.setNome("tubarao");
		tubarao.setComprimento(300);
		tubarao.setCor("cinzento");
		tubarao.setVelocidade(1.5);
		tubarao.setCaracterísticas("Barbatanas e cauda");
		
		ursoDoCanada.setNome("urso-do-canada");
		ursoDoCanada.setComprimento(180);
		ursoDoCanada.setCor("vermelho");
		ursoDoCanada.setVelocidade(0.5);
		ursoDoCanada.setAlimento("Mel");
		
		System.out.println(camelo.toString());
		
		System.out.println();
		
		System.out.println(tubarao.toString());
		
		System.out.println();
		
		System.out.println(ursoDoCanada.toString());

	}

}
