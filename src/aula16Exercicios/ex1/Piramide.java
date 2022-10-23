package aula16Exercicios.ex1;

public class Piramide extends Figura3D{

	private double ladoBase;
	private double altura;
	
	public double getLadoBase() {
		return ladoBase;
	}

	public void setLadoBase(double ladoBase) {
		this.ladoBase = ladoBase;
	}


	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	
	@Override
	public double calcularVolume() {
		double volume = (Math.pow(this.ladoBase, 2) * this.altura)/3;
	
		return volume;
	}

	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return 0;
	}

}
