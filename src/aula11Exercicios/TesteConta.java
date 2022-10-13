package aula11Exercicios;

import java.util.Scanner;

public class TesteConta {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		ContaCorrente conta = new ContaCorrente(20222123,2000.0,true,1000.0);
		boolean flag = true;

		double saque;
		double deposito;
		
		
		byte numero;

		while(flag) {
			System.out.println("Seu numero da conta e --> " + conta.numeroDaConta);
			System.out.println("Seu limite e --> " + conta.limite);
			System.out.println("Seu saldo atual e --> " + conta.saldo);
			System.out.println("Deseja sacar - 1");
			System.out.println("Deseja depositar - 2");
			System.out.println("Deseja sair - 0");
			numero = input.nextByte();
			
			if(numero == 1) {
				System.out.print("Quanto deseja sacar : ");
				saque = input.nextDouble();
				
				conta.saldo = conta.sacar(saque);
				conta.verSaldo();
			}else if(numero == 2){
				System.out.print("Quanto deseja depositar : ");
				deposito = input.nextDouble();
				
				conta.saldo = conta.depositar(deposito);
				conta.verSaldo();
			}else if(numero == 0) {
				System.out.println("Voce saiu tchau tchau!!");
				flag = false;
			}else {
				System.out.println("Opcao invalida, Digite novamente");
			}
			
		}
		
	}

}
