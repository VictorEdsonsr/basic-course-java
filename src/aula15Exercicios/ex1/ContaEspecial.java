package aula15Exercicios.ex1;

public class ContaEspecial extends ContaBancaria{
	private double limite;
	
	public double getLimite() {
		return limite;
	}
	
	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	public boolean sacar(double saque) {
		if((this.limite + getSaldo()) - saque >= 0) {
			this.setSaldo(this.getSaldo() - saque);
			return true;
		}
		
		return false;
	}
	
	@Override
	public String toString() {
        String text = "ContaEspecial[";
        text += " limite: " + limite;
        text += "; " + super.toString(); 
        text += "]" ;
        return text; 
	}
}

