package aula12Exercicios;

public class ConverterAreas {
	private static double area;

	public double getArea() {
		return area;
	}

	public static void setArea(double area) {
		ConverterAreas.area = area;
	}
	
	public static void metroParaPe() {
		double convertendo = 0;
		convertendo = area * 10.76;
		
		setArea(convertendo);
	}
	
	public static void peParaCentimetro() {
		double convertendo = 0;
		convertendo = area * 929;
		
		setArea(convertendo);
	}
	
	public static void milhaParaAcre() {
		double convertendo = 0;
		convertendo = area * 640;
		
		setArea(convertendo);
	}
	
	public static void acreParaPe() {
		double convertendo = 0;
		convertendo = area * 43.560;
		
		setArea(convertendo);
	}
}

/*
 1 metro quadrado -- 10.76 pes quadrados
 20 metros quadrados -- x pes quadrados
 */