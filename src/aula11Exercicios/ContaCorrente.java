package aula11Exercicios;


public class ContaCorrente {

	int numeroDaConta;
	double saldo;
	boolean status;
	double limite;
	
	public ContaCorrente(int numeroDaConta, double saldo, boolean status, double limite) {
		this.numeroDaConta = numeroDaConta;
		this.saldo = saldo;
		this.status = status;
		this.limite = limite;
	}
	

	public double depositar(double deposito) {
		if(deposito < 0) {
			System.out.println("Precisa depositar um valor acima de 0 reais");
		}else {
			this.saldo += deposito;
			System.out.println("Voce depositou R$ " + deposito);
		}
		
		return this.saldo;
	}
	
	public double sacar(double saque) {
		if(saque > this.saldo) {
			System.out.println("Voce nao tem saldo suficinete");
		}else {
			this.saldo -= saque;
			System.out.println("Voce sacou R$ " + saque);
		}
		
		return this.saldo;
	}
	
	public void verSaldo() {
		System.out.println("Seu saldo atual e --> R$ " + this.saldo);
	}
		
}
