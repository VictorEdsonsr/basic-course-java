package com.victor.coursejava.aula5Exercicios;

import java.util.Scanner;

public class Ex004 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite as quatro notas do seu bimestre: ");
        double noteOne = scan.nextDouble();
        double noteTwo = scan.nextDouble();
        double noteThree = scan.nextDouble();
        double noteFour = scan.nextDouble();

        double media = (noteOne + noteTwo + noteThree + noteFour )/ 4;

        System.out.println("A sua media e: " + media);
    }
}
