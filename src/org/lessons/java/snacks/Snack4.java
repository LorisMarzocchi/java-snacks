package org.lessons.java.snacks;

import java.util.Scanner;

public class Snack4 {
    public static void main(String[] args) {
/*        Scanner scan = new Scanner(System.in);
        System.out.println("inserisci una parola per verificare se è palindroma");
        String parola = scan.nextLine().toLowerCase();

        String reverseWord = "";
        for (int i = parola.length() - 1; i >= 0; i--) {
            reverseWord += (parola.charAt(i));
        }
        if (parola.equals(reverseWord)) {
            System.out.println("La parola è palindroma.");
        } else {
            System.out.println("La parola non è palindroma.");
        }*/


        Scanner scan = new Scanner(System.in);
        System.out.println("inserisci una parola per verificare se è palindroma");
        String parola = scan.nextLine().toLowerCase();

        StringBuilder reverseWord = new StringBuilder();
        for (int i = parola.length() - 1; i >= 0; i--) {
            reverseWord.append(parola.charAt(i));
        }
        if (parola.contentEquals(reverseWord)) {
            System.out.println("La parola è palindroma.");
        } else {
            System.out.println("La parola non è palindroma.");
        }

        scan.close();
    }

}
