package org.lessons.java.snacks;

import java.util.Random;

public class Snack2 {
    public static void main(String[] args) {
        String[] nomi = {"Andrea", "Marco", "Giuseppe", "Luca", "Nicola"};
        String[] cognomi = {"Rossi", "Marchi", "Santo", "Sesti", "Nicolini"};

        Random ran = new Random();

        int numInvitati = 10;

        System.out.println("Lista invitati");
        for (int i = 0; i < numInvitati; i++) {
            String nomiCasuali = nomi[ran.nextInt(nomi.length)];
            String cognomiCasuali = cognomi[ran.nextInt(nomi.length)];

            System.out.println(nomiCasuali + " " + cognomiCasuali);

        }

    }
}
