package aula15Exercicios.ex1;

public class ContaBancaria {
	private String contaCliente;
	private String numConta;
	protected double saldo;
	
	public String getContaCliente() {
		return contaCliente;
	}
	
	public void setContaCliente(String contaCliente) {
		this.contaCliente = contaCliente;
	}
	
	public String getNumConta() {
		return numConta;
	}
	
	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	@Override
	public String toString() {
		String text = "Conta [ ContaCliente = " + this.contaCliente + "; " ;
		text += "numConta = " + this.numConta + "; ";
		text += "saldo = " + this.saldo + " ]";
		return text;
	}
	
	public boolean sacar(double saque) {
		if((this.saldo - saque) >= 0) {
			this.saldo -= saque;
			return true;
		}
		return false;
	}
	
	public double depositar(double deposito) {
		return this.saldo += deposito;
	}
	
}
