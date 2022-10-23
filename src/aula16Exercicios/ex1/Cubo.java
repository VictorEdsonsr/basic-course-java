package aula16Exercicios.ex1;

public class Cubo extends Figura3D {

	private double aresta;
	
	public double getAresta() {
		return aresta;
	}

	public void setAresta(double aresta) {
		this.aresta = aresta;
	}

	
	@Override
	public double calcularVolume() {
		double volume = Math.pow(aresta, 3);
		
		return volume;
	}

	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return 0;
	}

}
