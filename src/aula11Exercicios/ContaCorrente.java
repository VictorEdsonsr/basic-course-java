package aula11Exercicios;


public class ContaCorrente {

	private int numeroDaConta;
	private double saldo;
	private boolean status;
	private double limite;
	
	public ContaCorrente() {
		
	}
	
	public ContaCorrente(int numeroDaConta, double saldo, boolean status, double limite) {
		this.numeroDaConta = numeroDaConta;
		this.saldo = saldo;
		this.status = status;
		this.limite = limite;
	}
	

	public int getNumeroDaConta() {
		return numeroDaConta;
	}
	
	public void setNumeroDaConta(int numeroDaConta) {
		this.numeroDaConta = numeroDaConta;
	}
	
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public boolean isStatus() {
		return status;
	}
	
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	public double getLimite() {
		return limite;
	}
	
	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	
	public double depositar(double deposito) {
		double soma = 0;
		
		if(deposito < 0) {
			System.out.println("Precisa depositar um valor acima de 0 reais");
		}else {
			soma += deposito;
			setSaldo(soma);
			System.out.println("Voce depositou R$ " + deposito);
		}
		
		return soma;
	}
	
	public double sacar(double saque) {
		double subtracao = 0;
		
		if(saque > this.saldo) {
			System.out.println("Voce nao tem saldo suficinete");
		}else {
			subtracao -= saque;
			setSaldo(subtracao);
			System.out.println("Voce sacou R$ " + saque);
		}
		
		return subtracao;
	}
	
	public void verSaldo() {
		System.out.println("Seu saldo atual e --> R$ " + this.saldo);
	}
		
}
