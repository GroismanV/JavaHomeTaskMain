package de.telran.praktika120923;

import java.util.Scanner;

public class CheckEvenOdd {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("Число " + number + " является четным.");
        } else {
            System.out.println("Число " + number + "  является Не четным.");
        }
    }
}

