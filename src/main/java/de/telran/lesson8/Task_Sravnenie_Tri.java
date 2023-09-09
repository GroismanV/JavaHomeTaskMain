package de.telran.lesson8;

import java.util.Scanner;

public class Task_Sravnenie_Tri {

   public static void main(String[] args) {
        /*
        даны три числа x, y, z с любыми значениями (рандомно или пользователь вводит) 

        вывести эти три числа :
        1) в порядке возрастания
        2) в порядке убывания

         */


        int min;
        int mid;
        int max;
        int maxTemp1;
        int maxTemp2;

        System.out.println("Введите три разных числа- ");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();


        if ((x + y) > (y + z)) {
            maxTemp1 = x;
            maxTemp2 = y;
        } else {
            maxTemp1 = y;
            maxTemp2 = z;
        }
        if (maxTemp1 > maxTemp2 ) {
            max = maxTemp1;
            mid = maxTemp2;
            min = z;
        }
        else {
            max = maxTemp2;
            mid = maxTemp1;
            min = z;
        }


        System.out.println("По возрастанию: " + min + " " + mid + " " + max);
        System.out.println("Пo убыванию: " + max + " " + mid + " " + min);
    }
}

