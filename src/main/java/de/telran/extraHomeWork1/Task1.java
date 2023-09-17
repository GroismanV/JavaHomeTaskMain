package de.telran.extraHomeWork1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите число 1 ");
        double firstDoubleNummer = scanner.nextDouble();

        System.out.println("введите число 2 ");
        double secondDoubleNummer = scanner.nextDouble();


        double plusNummer = firstDoubleNummer + secondDoubleNummer;
        double minusNummer = firstDoubleNummer - secondDoubleNummer;
        double multNummer = firstDoubleNummer * secondDoubleNummer;
        double divNummer = firstDoubleNummer / secondDoubleNummer;

        System.out.println("Результат сложения" + plusNummer);
        System.out.println("Результат вычитания" + minusNummer);
        System.out.println("Результат умножения" + multNummer);
        System.out.println("Результат деления" + divNummer);

    }
}
