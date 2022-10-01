package com.victor.coursejava.aula5Exercicios;

import java.util.Scanner;

public class Ex003 {
    public static void main (String[] args){
        @SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

        System.out.println("Digite dois numeros: ");

        int numberOne = scan.nextInt();
        int numberTwo = scan.nextInt();
        int sum = numberOne + numberTwo;

        System.out.println("A soma e :" + sum);
    }
}
