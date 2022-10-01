package com.victor.coursejava.aula5Exercicios;

import java.util.Scanner;

public class Ex002 {
    public static void main(String[] args){
        @SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int number = scan.nextInt();

        System.out.println("O numero digitado foi: " + number);
    }
}
