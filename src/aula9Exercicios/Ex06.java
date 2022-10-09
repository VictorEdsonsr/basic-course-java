package aula9Exercicios;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		char[][] jogoDaVelha = new char[3][3];
		System.out.println("Jogador 1 = X");
		System.out.println("Jogador 2 = O");
		
		boolean ganhou = true, linhaColunaValida = true;
		int jogada = 0 , linha = 0, coluna = 0;
		char sinal;
		
		
		while(ganhou) {
			if(jogada % 2 == 0) { // jogador 1
				sinal = 'X';
				System.out.println("Vez do jogador 1");
			}else { // jogador 2
				sinal = 'O';
				System.out.println("Vez do jogador 2");
			}
			
			while(linhaColunaValida) {
				System.out.println("Escolha uma linha entre 1,2,3");
				linha = input.nextInt();
				
				if(linha >= 1 && linha <=3) {
					linha--;
				}else{
					System.out.println("Jogada invalida tente novamente.");
				}
				
				System.out.println("Escolha uma coluna entre 1,2,3");
				coluna = input.nextInt();

				if(coluna >= 1 && coluna <=3) {
					coluna--;
					linhaColunaValida = false;
					
				}else{
					System.out.println("Jogada invalida tente novamente.");
				}
				
			}
			
		
			
			
			if(jogoDaVelha[linha][coluna] == 'X' || jogoDaVelha[linha][coluna] == 'O') {
				System.out.println("Posicao ja esta ocupada escolha outra");
			}else {
				jogoDaVelha[linha][coluna] = sinal;
				jogada++;
			}
			
			for(int i = 0; i < jogoDaVelha.length; i++) {
				for(int j = 0; j < jogoDaVelha[i].length; j++) {
					System.out.print(jogoDaVelha[i][j] + " | ");
				}
				System.out.println();
			}
			
			if ((jogoDaVelha[0][0] == 'X' && jogoDaVelha[0][1] == 'X' && jogoDaVelha[0][2] == 'X') ||     //linha 1
                    (jogoDaVelha[1][0] == 'X' && jogoDaVelha[1][1] == 'X' && jogoDaVelha[1][2] == 'X') || //linha 2
                    (jogoDaVelha[2][0] == 'X' && jogoDaVelha[2][1] == 'X' && jogoDaVelha[2][2] == 'X') || //linha 3
                    (jogoDaVelha[0][0] == 'X' && jogoDaVelha[1][0] == 'X' && jogoDaVelha[2][0] == 'X') || //coluna 1
                    (jogoDaVelha[0][1] == 'X' && jogoDaVelha[1][1] == 'X' && jogoDaVelha[2][1] == 'X') || //coluna 2
                    (jogoDaVelha[0][2] == 'X' && jogoDaVelha[1][2] == 'X' && jogoDaVelha[2][2] == 'X') || //coluna 3
                    (jogoDaVelha[0][0] == 'X' && jogoDaVelha[1][1] == 'X' && jogoDaVelha[2][2] == 'X') || //diagonal
                    (jogoDaVelha[0][2] == 'X' && jogoDaVelha[1][1] == 'X' && jogoDaVelha[2][0] == 'X')){  //diagonal inversa
                ganhou = false;
                System.out.println("Parabéns, jogador 1 ganhou!");
            } else if ((jogoDaVelha[0][0] == 'O' && jogoDaVelha[0][1] == 'O' && jogoDaVelha[0][2] == 'O') ||     //linha 1
                    (jogoDaVelha[1][0] == 'O' && jogoDaVelha[1][1] == 'O' && jogoDaVelha[1][2] == 'O') || //linha 2
                    (jogoDaVelha[2][0] == 'O' && jogoDaVelha[2][1] == 'O' && jogoDaVelha[2][2] == 'O') || //linha 3
                    (jogoDaVelha[0][0] == 'O' && jogoDaVelha[1][0] == 'O' && jogoDaVelha[2][0] == 'O') || //coluna 1
                    (jogoDaVelha[0][1] == 'O' && jogoDaVelha[1][1] == 'O' && jogoDaVelha[2][1] == 'O') || //coluna 2
                    (jogoDaVelha[0][2] == 'O' && jogoDaVelha[1][2] == 'O' && jogoDaVelha[2][2] == 'O') || //coluna 3
                    (jogoDaVelha[0][0] == 'O' && jogoDaVelha[1][1] == 'O' && jogoDaVelha[2][2] == 'O') || //diagonal
                    (jogoDaVelha[0][2] == 'O' && jogoDaVelha[1][1] == 'O' && jogoDaVelha[2][0] == 'O')){  //diagonal inversa
                ganhou = false;
                System.out.println("Parabéns, jogador 2 ganhou!");
            } else if (jogada > 8){
                ganhou = false;
                System.out.println("Ninguém ganhou essa partida.");
            }
			
			
		}
		
	}

}
