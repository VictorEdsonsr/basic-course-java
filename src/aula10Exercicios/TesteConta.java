package aula10Exercicios;

import java.util.Scanner;

public class TesteConta {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		ContaCorrente conta = new ContaCorrente();
		boolean flag = true;

		double saque;
		double deposito;
		
		
		int numeroDaConta = conta.numeroDaConta = 20222123;
		conta.status = true;
		double limite = conta.limite = 2000;
		double saldo = conta.saldo = 1000;
		byte numero;

		while(flag) {
			System.out.println("Seu numero da conta e --> " + numeroDaConta);
			System.out.println("Seu limite e --> " + limite);
			System.out.println("Seu saldo atual e --> " + saldo);
			System.out.println("Deseja sacar - 1");
			System.out.println("Deseja depositar - 2");
			System.out.println("Deseja sair - 0");
			numero = input.nextByte();
			
			if(numero == 1) {
				System.out.print("Quanto deseja sacar : ");
				saque = input.nextDouble();
				
				saldo = conta.sacar(saque);
				conta.verSaldo();
			}else if(numero == 2){
				System.out.print("Quanto deseja depositar : ");
				deposito = input.nextDouble();
				
				saldo = conta.depositar(deposito);
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
