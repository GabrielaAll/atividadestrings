package org.example.atividadeStringsAula;

import java.util.Scanner;

public class nomeMaiusculo {
    public static void main(String[] args) {
        //Peça o nome da pessoa e mostre ele todo em MAIÚSCULO e todo em minúsculo.

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite seu Nome: ");
        String nome = sc.nextLine();

        String nomeMaiusculo = nome.toUpperCase();

        String nomeMinusculo = nome.toLowerCase();

        System.out.println("Seu nome em maiúsculo: " + nomeMaiusculo);
        System.out.println("Seu nome em minúsculo: " + nomeMinusculo);

        sc.close();
    }
}
