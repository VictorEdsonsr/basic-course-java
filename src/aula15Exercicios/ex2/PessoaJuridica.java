package aula15Exercicios.ex2;

public class PessoaJuridica extends Contribuinte{
	private String cnpj;
	
	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public double calcularImposto() {
		return this.getRendaBruta() * 0.1;
	}
	
	@Override
	public String toString() {
		String text = super.toString();
		text += "Pessoa Juridica --> ";
		text += "[ cnpj - " + this.cnpj + " ";
		text += "renda bruta - " + this.getRendaBruta() + " ]";
		
		return text;
	}
}
