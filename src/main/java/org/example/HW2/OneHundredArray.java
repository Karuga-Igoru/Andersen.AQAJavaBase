package org.example.HW2;

public class OneHundredArray {
    static int[] printOneHundred() {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        return array;
    }
}
