package org.lessons.java.snacks;

public class Snack5 {
    public static void main(String[] args) {
        String numeroStr = "25";
        int numeroInt = 0;

        for (int i = 0; i < numeroStr.length(); i++) {
            // Ottiene il valore numerico del carattere corrente
            int valoreCorrente = numeroStr.charAt(i) - '0';

            System.out.println(valoreCorrente);
            // Aggiorna numeroInt moltiplicandolo per 10 (sposta il numero di una posizione)
            // e aggiunge il valoreCorrente
            numeroInt = numeroInt * 10 + valoreCorrente;
        }

        System.out.println("Il numero convertito è: " + numeroInt);
    }
}
