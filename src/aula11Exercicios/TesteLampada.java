package aula11Exercicios;

public class TesteLampada {

	public static void main(String[] args) {
		Lampada lampada = new Lampada("Amarela","Philips","LED");
		lampada.apresentar();
		
		
		lampada.ligar();
		lampada.desligar();
		
		
	}

}
