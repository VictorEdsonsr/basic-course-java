package aula16Exercicios.ex1;

public class Teste {

	public static void main(String[] args) {
		Circulo circulo = new Circulo();
		Triangulo triangulo = new Triangulo();
		Quadrado quadrado = new Quadrado();
		Cubo cubo = new Cubo();
		Cilindro cilindro = new Cilindro();
		Piramide piramide = new Piramide();
		FiguraGeometrica[] lista = new FiguraGeometrica[6];
		
		circulo.setNome("Circulo");
		circulo.setCor("Azul");
		circulo.setRaio(5);
		
		triangulo.setNome("Triangulo");
		triangulo.setCor("Vermelho");
		triangulo.setAltura(4);
		triangulo.setBase(7);
		
		quadrado.setNome("Quadrado");
		quadrado.setCor("Verde");
		quadrado.setLado(8);
		
		
		cubo.setNome("Cubo");
		cubo.setCor("Cinza");
		cubo.setAresta(5);
		
		cilindro.setNome("Cilindro");
		cilindro.setCor("Castanho");
		cilindro.setAltura(6);
		cilindro.setRaio(8);
		
		piramide.setNome("Piramide");
		piramide.setCor("Preto");
		piramide.setAltura(9);
		piramide.setLadoBase(8);
		
		lista[0] = circulo;
		lista[1] = triangulo;
		lista[2] = quadrado;
		lista[3] = cubo;
		lista[4] = cilindro;
		lista[5] = piramide;
		
		
		for(int i = 0; i < lista.length; i++) {
			System.out.println("----------------------");
			System.out.println(lista[i].getNome());
			System.out.println(lista[i].getCor());
			if(lista[i] instanceof Figura2D) {
				Figura2D fig2d = (Figura2D) lista[i];
				System.out.println("Area --> " + fig2d.calcularArea());
			}else if(lista[i] instanceof Figura3D) {
				Figura3D fig3d = (Figura3D) lista[i];
				System.out.println("Volume --> " + fig3d.calcularVolume());
			}
		}
		
	}

}
