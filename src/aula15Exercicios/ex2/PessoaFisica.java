package aula15Exercicios.ex2;

public class PessoaFisica extends Contribuinte{
	private String cpf;
	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public double calcularImposto() {
		double renda = getRendaBruta();
		
		if(renda <= 1400) {
			return 0;
		}
		
		if(renda > 1400 && renda <= 2100) {
			return (renda * 0.1) - 100;
		}
		
		if(renda > 2100 && renda <= 2800) {
			return (renda * 0.15) - 270;
		}
		
		if(renda > 2800 && renda <= 3600) {
			return (renda * 0.25) - 500;
		}
		return (renda * 0.30) - 700;
	}
	
	
	@Override
	public String toString() {
		String text = super.toString();
		text += "Pessoa Fisica --> ";
		text += "[ cpf - " + this.cpf + " ";
		text += "renda bruta - " + this.getRendaBruta() + " ]";
		
		return text;
	}
}
