package aula16Exercicios.ex1;

public class Cilindro extends Figura3D{
	private double raio;
	private double altura;

	
	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	
	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public double calcularVolume() {
		double volume = (3.1415 * Math.pow(this.raio, 2)) * this.altura;
		
		return volume;
	}

	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return 0;
	}

}
