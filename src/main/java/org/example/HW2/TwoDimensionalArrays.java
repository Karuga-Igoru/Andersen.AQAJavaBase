package org.example.HW2;

public class TwoDimensionalArrays {
    static void twoDimensional() {
        int[][] array = new int[5][5];
        int i,j;
        int n = array.length;
        for (i = 0; i < array.length; i++) {
            array[i][i] = 1;
            n--;
            array[i][n] = 1;
        }
        for (i = 0; i < array.length; i++) {
            for (j = 0; j < array.length; j++ ) {
                System.out.print(array[i][j]);
            }
        System.out.println();
        }
    }
}
