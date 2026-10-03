package org.example;

import java.util.Scanner;

public class frasePalavra {
    public static void main(String[] args) {

        //Peça uma frase e uma palavra. Diga se a palavra aparece dentro da frase.
        //Digite uma frase: Estou aprendendo Java
        //Digite uma palavra: Java
        //A palavra aparece na frase? true

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String frase = sc.nextLine();

        System.out.print("Digite uma palavra: ");
        String palavra = sc.nextLine();

        boolean existe = frase.contains(palavra);

        System.out.println(existe);

        sc.close();

    }
}
