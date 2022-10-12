package aula10Exercicios;

public class Ex01 {

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
