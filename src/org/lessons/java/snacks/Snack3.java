package org.lessons.java.snacks;

public class Snack3 {
    public static void main(String[] args) {
        int[] numeri = {1,2,3,4,5,6,7,8,9,10};
        int somma= 0;
        for (int i = 0; i < numeri.length; i++) {
            if (i % 2 != 0) {
                somma += numeri[i];
            }
        }
        System.out.println(somma);
    }
}
