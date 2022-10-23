package aula16Exercicios.ex1;

public class Quadrado extends Figura2D{
	private double lado;
	
	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}




	@Override
	public double calcularArea() {
		double area = Math.pow(this.lado, 2);
		
		return area;
	}

}
