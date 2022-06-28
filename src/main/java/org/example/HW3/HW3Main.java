package org.example.HW3;

import java.util.Scanner;

public class HW3Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person[] persArray = new Person[6];
        persArray[0] = new Person("Yoda", "Grandmaster", "yodamaster@corusant.com",
                "1571189935", 10, 875);
        persArray[1] = new Person("Mace Windu", "Master", "iwantviolet@corusant.com",
                "1975260163", 1000000, 45);
        persArray[2] = new Person("Obiwan Kenobi", "Master", "hellothere@corusant.com",
                "1778339185", 40000, 40);
        persArray[3] = new Person("Kyle Katarn", "Knight", "guywithlightsaber@yavin.com",
                "1687510130", 50000, 39);
        persArray[4] = new Person("Anakin Skywalker", "Knight", "dontlikesand@padme.com",
                "1796264781", 30000, 27);
        persArray[5] = new Person("Ahsoka Tano", "Padawan", "snips@corusant.com",
                "1994161054", 10000, 18);
        System.out.print("Enter age limit:");
        int chooseAge = sc.nextInt();
        for (Person person : persArray) {
            if (person.getAge() >= chooseAge) {
                System.out.println(person);
            }
        }
    }
}

