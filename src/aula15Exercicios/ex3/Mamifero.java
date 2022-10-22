package aula15Exercicios.ex3;

public class Mamifero extends Animal{
	private String alimento;

	public Mamifero() {
		super();
		this.setAmbiente("Terra");
	}

	public String getAlimento() {
		return alimento;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}
	
	@Override
	public String toString() {
		String text = super.toString();
		text += "Alimento: " + this.alimento;
		return text;
	}
}
