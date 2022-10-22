package aula15Exercicios.ex3;

public class Animal {
	private String nome;
	private double comprimento;
	private int patas;
	private String cor;
	private String ambiente;
	private double velocidade;
	
	public Animal() {
		this.patas = 4;
	}
	
	public int getPatas() {
		return patas;
	}
	public void setPatas(int patas) {
		this.patas = patas;
	}
	public String getAmbiente() {
		return ambiente;
	}
	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getComprimento() {
		return comprimento;
	}
	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public double getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}
	
	
	@Override
	public String toString() {
		String text = "Animal: " + this.nome + "\n";
		text += "Comprimento: " + this.comprimento + "cm" + "\n";
		text += "Patas: " + this.getPatas() + "\n";
		text += "Cor: " + this.cor + "\n";
		text += "Ambiente: " + this.ambiente + "\n";
		text += "Velocidade: " + this.velocidade + "m/s" + "\n";
		return text;
	}
}
