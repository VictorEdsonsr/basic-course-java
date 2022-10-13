package aula11Exercicios;

public class Lampada {
	private String cor;
	private String tipo;
	private String modelo;
	private boolean interruptor = false;
	
	public Lampada() {
		
	}
	
 	public Lampada(String cor, String tipo, String modelo) {
		this.cor = cor;
		this.tipo = tipo;
		this.modelo = modelo;
	}
 	
 	
 	public String getCor() {
 		return cor;
 	}
 	
 	public void setCor(String cor) {
 		 this.cor = cor;
 	}
	
 	public String getTipo() {
 		return tipo;
 	}
 	
 	public void setTipo(String tipo) {
 		 this.tipo = tipo;
 	}
 	
 	public String getModelo() {
 		return modelo;
 	}
 	
 	public void setModelo(String modelo) {
 		 this.modelo = modelo;
 	}
 	
 	public boolean isInterruptor() {
 		return interruptor;
 	}
 	
 	public void setInterruptor(boolean interruptor) {
 		 this.interruptor = interruptor;
 	}
 	
	public boolean ligar() {
			if(this.interruptor == false) {
				setInterruptor(true);
				System.out.println("Interruptor ligado");
			}
			
			return this.interruptor;
		}
		
	public boolean desligar() {
			if(this.interruptor == true) {
				setInterruptor(false);
				System.out.println("Interruptor desligado");
			}else {
				System.out.println("Ligue para desligar");
			}
			
			return this.interruptor;
		}
	
	void apresentar() {
		System.out.println("Lampada de cor --> " + this.cor);
		System.out.println("Lampada de tipo --> " + this.tipo);
		System.out.println("Lampada de modelo --> " + this.modelo);
	}
	
}
