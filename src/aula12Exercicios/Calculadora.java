package aula12Exercicios;

public class Calculadora {
	
	private static double num1;
	private static double num2;
	
	public double getNum2() {
		return num2;
	}

	public void setNum2(double num2) {
		Calculadora.num2 = num2;
	}

	public double getNum1() {
		return num1;
	}

	public void setNum1(double num1) {
		Calculadora.num1 = num1;
	}
	
	public static double soma() {
		return num1 + num2;
	}
	

	public static double subtracao() {
		return num1 - num2;
	}
	
	public static double multiplicacao() {
		return num1 * num2;
	}
	
	public static double divisao() {
		return num1 / num2;
	}
	
	public static double potencia() {
		return Math.pow(num1, num2);
	}
	
	public static void fatorial() {
		double fatorialNum1 = 1;
		double fatorialNum2 = 1;
		
		System.out.print("Fatorial numero 1 --> " + num1 + "! = ");
		for (double i = num1; i > 1; i--) {
			fatorialNum1 *= i;
			
			System.out.print(i + " . " );
		}
		System.out.print("1.0 = " + fatorialNum1);
		
		System.out.println();
		
		System.out.print("Fatorial numero 1 --> " + num1 + "! = ");
		for (double i = num2; i > 1; i--) {
			fatorialNum2 *= i;
			
			System.out.print(i + " . ");
		}
		
		System.out.print("1.0 = " + fatorialNum2);
	}

}
