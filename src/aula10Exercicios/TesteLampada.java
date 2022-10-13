package aula10Exercicios;

public class TesteLampada {

	public static void main(String[] args) {
		Lampada lampada = new Lampada();
		
		lampada.cor = "Amarela";
		lampada.modelo = "Philips";
		lampada.tipo = "LED";
		lampada.apresentar();
		
		
		lampada.ligar();
		lampada.desligar();
		
		
	}

}
