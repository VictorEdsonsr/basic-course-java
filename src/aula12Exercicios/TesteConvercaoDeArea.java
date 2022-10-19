package aula12Exercicios;

import java.util.Scanner;

public class TesteConvercaoDeArea {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Digite qual tamanho da area: ");
		ConverterAreas.setArea(input.nextDouble());
		
		efetuando();

	}
	static void opcoes() {
		System.out.println("Digite qual conversao deseja: ");
		System.out.println("1 - metro quadrado --> pes quadrados");
		System.out.println("2 - pes quadrados --> centimetros quadrados");
		System.out.println("3 - milha quadrada --> acres");
		System.out.println("4 - acres --> pes quadrados");
	}

	
	static void efetuando() {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		ConverterAreas areas = new ConverterAreas();
		
		boolean flag = true;
		int operacao = 0;
		
		while(flag) {
			
			opcoes();
			operacao = input.nextInt();
			
			if(operacao != 1 && operacao != 2 && operacao != 3 && operacao != 4 ) {
				System.out.println("Opcao invalida, Digite novamente");
				
			}else {
				switch(operacao) {
				case 1:
					System.out.print(areas.getArea() + " metros quadrados --> ");
					ConverterAreas.metroParaPe();
					System.out.print(areas.getArea() + " pes quadrados");
					flag = false;
					break;
				
				case 2:
					System.out.print(areas.getArea() + " pes quadrados --> ");
					ConverterAreas.peParaCentimetro();
					System.out.print(areas.getArea() + " centimetros quadrados");
					flag = false;
					break;
					
				case 3:
					System.out.print(areas.getArea() + " milhas quadradas --> ");
					ConverterAreas.milhaParaAcre();
					System.out.print(areas.getArea() + " acres");
					flag = false;
					break;
					
				case 4:
					System.out.print(areas.getArea() + " acres --> ");
					ConverterAreas.acreParaPe();
					System.out.print(areas.getArea() + " pes quadrados");
					flag = false;
					break;	
				}
			}
		}
	}
}
