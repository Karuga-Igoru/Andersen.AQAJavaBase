package org.example.HW2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HW2Main {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("***************");
        System.out.println("Two numbers sum betweeen 10 and 20 is: " +
                TwoNumbersSum.checkSum(rnd.nextInt(20), rnd.nextInt(20)));
        System.out.println("***************");
        SignOfNumber.isNumberPositive(rnd.nextInt(20) - rnd.nextInt(20));
        System.out.println("***************");
        System.out.println("Number is negative: " + ReversedSignOfNumber.isNumberNegative(rnd.nextInt(20) - rnd.nextInt(20)));
        System.out.println("***************");
        System.out.println("Enter the string and press Enter");
        StringWriter.printStringNTimes(sc.nextLine(), rnd.nextInt(10));
        System.out.println("***************");
        System.out.println("Enter the year:");
        System.out.println("Is this year leap: " + LeapYear.isYearLeap(sc.nextLine()));
        System.out.println("***************");
        System.out.println("[1, 1, 0, 0, 1, 0, 1, 1, 0, 0]");
        System.out.println(Arrays.toString(BinaryArray.revertArray()));
        System.out.println("***************");
        System.out.println(Arrays.toString(OneHundredArray.printOneHundred()));
        System.out.println("***************");
        FindAndMultiplyArray.multiplyArrayElements();
        System.out.println("***************");
        TwoDimensionalArrays.twoDimensional();
        System.out.println("***************");
        System.out.println(Arrays.toString(CreatingArray.createArrayFrom(rnd.nextInt(10), rnd.nextInt(10))));
    }
}
