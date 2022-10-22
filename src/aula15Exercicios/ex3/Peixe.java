package aula15Exercicios.ex3;

public class Peixe extends Animal{
	private String características;
	public Peixe(){
		super();
		this.setPatas(0);
		this.setAmbiente("mar");
	}
	
	public String getCaracterísticas() {
		return características;
	}

	public void setCaracterísticas(String características) {
		this.características = características;
	}
	
	@Override
	public String toString() {
		String text = super.toString();
		text += "Patas " + super.getPatas();
		text += "Caracteristica: " + this.características;
		
		return text;
	}
}
