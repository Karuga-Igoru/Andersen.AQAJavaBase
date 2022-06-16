package org.example.HW1;

import java.util.Random;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    static void printThreeWords() {
        System.out.println("Orange\nApple\nBanana");
    }

    static void checkSumSign() {
        Random rnd = new Random();
        int a = rnd.nextInt(100) - rnd.nextInt(100);
        int b = rnd.nextInt(100) - rnd.nextInt(100);
        int c = a + b;
        System.out.println((c < 0) ? "Summary is negative" : "Summary is positive");
    }

    static void printColor() {
        Random rnd = new Random();
        int value = rnd.nextInt(500) - rnd.nextInt(500);
        if (value > 100) {
            System.out.println("Green");
        } else if (value > 0) {
            System.out.println("Yellow");
        } else System.out.println("Red");
    }

    static void compareNumbers() {
        Random rnd = new Random();
        int a = rnd.nextInt(100);
        int b = rnd.nextInt(100);
        System.out.println((a >= b) ? "a >= b" : "a < b");
    }
}
