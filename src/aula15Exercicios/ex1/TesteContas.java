package aula15Exercicios.ex1;

public class TesteContas {

	public static void main(String[] args) {
		ContaPoupanca conta = new ContaPoupanca();
		
		conta.setContaCliente("Conta simples");
		conta.setNumConta("999999");
		conta.setSaldo(2000);
		conta.setDiaRendimento(22);
		
		if(conta.calculaRendimento(0.1)) {
			System.out.println("Seu novo rendimento e --> " + conta.getSaldo());
		}else {
			System.out.println("Hoje nao e dia de rendimento");
		}
		
		System.out.println(conta.toString());
//		
//		if(conta.sacar(20009)) {
//			System.out.println("Voce sacou!! seu saldo agora e --> R$" + conta.getSaldo() );
//		}else {
//			System.out.println("Saldo insuficiente");
//		}

	}

}
