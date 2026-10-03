package org.example;

import java.util.Scanner;

public class stringsatividade {
    public static void main(String[] args) {

        //Peça o nome completo da pessoa e mostre quantas letras ele tem (contando os espaços).

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite seu Nome Completo: ");
        String nomeCompleto = sc.nextLine();

        int quantidadeLetras = nomeCompleto.length();

        System.out.println("Seu nome completo possui " + quantidadeLetras + " caracteres, contando os espaços.");

        sc.close();
    }
}
