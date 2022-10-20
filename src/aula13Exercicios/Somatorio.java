package aula13Exercicios;

public class Somatorio {
	public static int soma(int num) {
		if(num == 1) {
			return 1;
		}
		return num + soma(num-1);
	}
}
