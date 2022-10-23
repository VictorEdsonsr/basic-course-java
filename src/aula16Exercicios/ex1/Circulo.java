package aula16Exercicios.ex1;

public class Circulo extends Figura2D {
	private double raio;
		
	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	@Override
	public double calcularArea() {
		double area = 3.1415 * Math.pow(this.raio, 2);
		return area;
	}



}
