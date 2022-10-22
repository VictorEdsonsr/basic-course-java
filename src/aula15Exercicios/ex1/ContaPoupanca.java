package aula15Exercicios.ex1;

import java.util.Calendar;

public class ContaPoupanca extends ContaBancaria {
	private int diaRendimento;
	
	public int getDiaRendiamento() {
		return diaRendimento;
	}
	
	public void setDiaRendimento(int diaRendimento) {
		this.diaRendimento = diaRendimento;
	}
	
	public boolean calculaRendimento(double taxaRendimento) {
		Calendar dia = Calendar.getInstance();
		
		if(this.diaRendimento == dia.get(Calendar.DAY_OF_MONTH)) {
			setSaldo(super.saldo + (super.saldo * taxaRendimento));
			return true;
		}
		
		return false;
	}
	
	@Override
	public String toString() {
		String text ="ContaPoupanca [";
		text += super.toString();
		text += "DiaRendimento -> " + this.diaRendimento;
		text += " ]";
		
		return text;
	}
	
}
