package aula6Exercicios;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Escreva o preco dos produtos: ");
		
		double produtoUm = scan.nextDouble();
		double produtoDois = scan.nextDouble();
		double produtoTres = scan.nextDouble();
		
		if(produtoUm < produtoDois && produtoUm < produtoTres) {
			System.out.println("compre o primeiro produto: R$" + produtoUm);
		}else if(produtoDois < produtoUm && produtoDois < produtoTres) {
			System.out.println("compre o segundo produto: R$" + produtoDois);
		}else {
			System.out.println("compre o terceiro produto: R$" + produtoTres);
		}

	}

}
