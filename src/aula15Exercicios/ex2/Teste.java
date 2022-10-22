package aula15Exercicios.ex2;

public class Teste {

	public static void main(String[] args) {
		PessoaFisica pf = new PessoaFisica();
		PessoaJuridica pj = new PessoaJuridica();
		
		pf.setNome("Victor");
		pf.setCpf("");
		pf.setRendaBruta(2500);
		System.out.println(pf.toString());
		System.out.println("Seu imposto e --> " + pf.calcularImposto());
		
		System.out.println();
		
		pj.setNome("Victor");
		pj.setCnpj("");
		pj.setRendaBruta(2500);
		System.out.println(pj.toString());
		System.out.println("Seu imposto e --> " + pj.calcularImposto());

	}

}
