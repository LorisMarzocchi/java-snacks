package org.lessons.java.snacks;

import java.util.Scanner;

public class Snack1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("inserisci il primo numero: ");
        int numero = scan.nextInt();
        if (numero % 2 == 0){
            System.out.println("Il numero è pari: " + numero);
        }else {
            numero += 1;
            System.out.println("Il numero è dispari, stampo il numero successivo: " +numero);
           /* System.out.println("Il numero è dispari, stampo il numero successivo: " + (numero + 1));*/
        }
    }
}
