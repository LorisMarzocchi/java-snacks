package org.lessons.java.snacks;

import java.util.Scanner;

public class Snack6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("inserisci i secondi: ");
        int secondiUtente = scan.nextInt();

        int ore = secondiUtente / 3600;
        int minuti = (secondiUtente % 3600) / 60;
        int secondi = secondiUtente % 60;

        String risultato = String.format("%02d:%02d:%02d", ore, minuti, secondi);

        System.out.println("Orario corrispondente: " + risultato);



    }
}
