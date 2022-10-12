package aula10Exercicios;

public class Lampada {
	String cor;
	String tipo;
	String modelo;
	boolean interruptor = false;
	
	boolean ligar() {
			if(interruptor == false) {
				interruptor = true;
				System.out.println("Interruptor ligado");
			}
			
			return interruptor;
		}
		
	boolean desligar() {
			if(interruptor == true) {
				interruptor = false;
				System.out.println("Interruptor desligado");
			}else {
				System.out.println("Ligue para desligar");
			}
			
			return interruptor;
		}
	
	void apresentar() {
		System.out.println("Lampada de cor --> " + cor);
		System.out.println("Lampada de tipo --> " + tipo);
		System.out.println("Lampada de modelo --> " + modelo);
	}
	
}
