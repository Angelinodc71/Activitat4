package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Cuantas veces quieres tirar?");
        int tiros = teclado.nextInt();
        int dados []= new int[tiros];
        for (int i = 0; i < tiros; i++) {
            int dado0 = rand.nextInt(6)+1;
            int dado1 = rand.nextInt(6)+1;
            dados [i] = dado0+dado1;
        }
        for (int i = 2; i < 13 ; i++) {
            int cont = 0;
            for (int j = 0; j < dados.length; j++) {
                if (i == dados[j]) {
                   cont++;
                }
            }
            System.out.println(i+" "+"se repite "+cont+" veces");
        }
    }
}
