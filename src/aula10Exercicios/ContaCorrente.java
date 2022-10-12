package aula10Exercicios;


public class ContaCorrente {

	int numeroDaConta;
	double saldo;
	boolean status;
	double limite;
	

	double depositar(double deposito) {
		if(deposito < 0) {
			System.out.println("Precisa depositar um valor acima de 0 reais");
		}else {
			saldo += deposito;
			System.out.println("Voce depositou R$ " + deposito);
		}
		
		return saldo;
	}
	
	double sacar(double saque) {
		if(saque > saldo) {
			System.out.println("Voce nao tem saldo suficinete");
		}else {
			saldo -= saque;
			System.out.println("Voce sacou R$ " + saque);
		}
		
		return saldo;
	}
	
	void verSaldo() {
		System.out.println("Seu saldo atual e --> R$ " + saldo);
	}
		
}
