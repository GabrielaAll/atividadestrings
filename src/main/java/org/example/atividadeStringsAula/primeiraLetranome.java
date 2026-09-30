package org.example.atividadeStringsAula;

import java.util.Scanner;

public class primeiraLetranome {
    public static void main(String[] args) {

        //Peça o nome da pessoa e mostre a primeira letra dele.

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite seu Nome: ");
        String letraNome = sc.nextLine();

        char primeiraLetra = letraNome.charAt(0);

        System.out.println("A primeira Letra do seu nome é: " + primeiraLetra);

        sc.close();
    }
}
