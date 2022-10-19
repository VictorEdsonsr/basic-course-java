package aula12Exercicios;

import java.util.Scanner;

public class TesteCalculadora {

	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		Calculadora calculadora = new Calculadora();

		System.out.println("Digite o primeiro numero: ");
		calculadora.setNum1(input.nextDouble());
		
		System.out.println("Digite o segundo numero: ");
		calculadora.setNum2(input.nextDouble());
		
		efetuando();

	}
	
	static void opcoes() {
		System.out.println("Digite o numero da operacao que deseja: ");
		System.out.println("1 - soma(+)");
		System.out.println("2 - subtracao(-)");
		System.out.println("3 - multiplicacao(*)");
		System.out.println("4 - divisao(/)");
		System.out.println("5 - elevar a potencia(**)");
		System.out.println("6 - fatorial(!)");
	}
	
	static void efetuando() {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		boolean flag = true;
		int operacao = 0;
		
		while(flag) {
			opcoes();
			operacao = input.nextInt();
			
			if(operacao != 1 && operacao != 2 && operacao != 3 && operacao != 4 && operacao != 5 && operacao != 6) {
				System.out.println("Opcao invalida, Digite novamente");
				
			}else {
				switch(operacao) {
				case 1:
					System.out.println("Soma --> " + Calculadora.soma());
					flag = false;
					break;
				
				case 2:
					System.out.println("Subtracao --> " + Calculadora.subtracao());
					flag = false;
					break;
					
				case 3:
					System.out.println("Multiplicacao --> " + Calculadora.multiplicacao());
					flag = false;
					break;
					
				case 4:
					System.out.println("Divisao --> " + Calculadora.divisao());
					flag = false;
					break;
					
				case 5:
					System.out.println("Potencia --> " + Calculadora.potencia());
					flag = false;
					break;
					
				case 6:
					Calculadora.fatorial();
					flag = false;
					break;
				}
			}
		}
		
	}
	

}
