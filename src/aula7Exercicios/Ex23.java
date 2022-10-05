package aula7Exercicios;



public class Ex23 {

	public static void main(String[] args) {

        
        int quantidadeClientes = 50;
      
        double preco = 1.99;

        System.out.println("Lojas quase dois - tabela de precos" );
        
        for(int i = 1; i <= quantidadeClientes; i++) {
        	System.out.println(i + " - " + "R$ " + (i*preco) );
        }

	}

}
