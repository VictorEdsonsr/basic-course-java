package aula15Exercicios.ex2;

public abstract class Contribuinte {
	private String nome;
	private double rendaBruta;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getRendaBruta() {
		return rendaBruta;
	}
	public void setRendaBruta(double rendaBruta) {
		this.rendaBruta = rendaBruta;
	}
	
	public abstract double calcularImposto();
	
	@Override
	public String toString() {
		String text = "Nome --> " + this.nome + "\n";
		text += "Renda Bruta --> " + this.rendaBruta + "\n";
		
		return text;
	}
	
}
