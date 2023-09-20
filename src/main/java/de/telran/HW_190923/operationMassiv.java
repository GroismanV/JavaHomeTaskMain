package de.telran.HW_190923;

        /*Создайте массив из 8 случайных целых чисел из интервала [1;50]

        Выведите массив на консоль в строку.

        Замените каждый элемент с нечетным индексом на ноль.

        Снова выведете массив на консоль в отдельной строке.

               */


import java.util.Random;

public class operationMassiv {

    public static void main(String[] args) {


        int min = 1;
        int max = 50;
        Random random = new Random();

        int[] massiv = new int[8];
        int i;


        for (i = 0; i < 8; i++) {

            massiv[i] = random.nextInt(max - min + 1) + min;

            System.out.print(massiv[i] + ".");

        }
        System.out.println();

        for (i = 0; i < 8; i++) {
            if (i % 2 != 0 && i != 0) {
                massiv[i] = 0;

            }

            System.out.print(massiv[i] + ".");


        }
    }
}


