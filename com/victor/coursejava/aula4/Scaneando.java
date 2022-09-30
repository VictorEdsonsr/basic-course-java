package com.victor.coursejava.aula4;

import java.util.Scanner;

public class Scaneando {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("quantos anos voce tem, qual sua altura, tem pet, qual seu primeiro nome?");
        int idade = scan.nextInt();
        double altura = scan.nextDouble();
        boolean pet = scan.nextBoolean();
        String primeiroNome = scan.next();

        System.out.println("As informacoes passadas foram -> ");
        System.out.println("Sua idade e: " + idade);
        System.out.println("Sua altura : " + altura);
        System.out.println("tem pet : " + pet);
        System.out.println("Seu primeiro nome e : " + primeiroNome);
    }
}
