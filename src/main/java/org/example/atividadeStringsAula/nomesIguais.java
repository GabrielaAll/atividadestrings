package org.example.atividadeStringsAula;

import java.util.Scanner;

public class nomesIguais {
    public static void main(String[] args) {

        //Peça o nome da pessoa duas vezes e diga se os dois são iguais, ignorando maiúsculas e minúsculas.
        //Digite seu nome: Ana
        //Digite de novo: ANA
        //Os nomes são iguais? true

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite seu nome a primeira vez: ");
        String nome1 = sc.nextLine();

        System.out.print("Digite seu nome a segunda vez: ");
        String nome2 = sc.nextLine();

        boolean iguais = nome1.equalsIgnoreCase(nome2);

        System.out.println("Os nomes são iguais? " + iguais);

        sc.close();
    }
}
