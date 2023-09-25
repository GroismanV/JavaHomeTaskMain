package de.telran.HW210923;

import java.util.Random;

/*Задание №5.
        Создайте 2 массива из 5 случайных целых чисел из отрезка [0;5] каждый
        Выведите массивы на экран в двух отдельных строках
        Посчитайте среднее арифметическое элементов каждого массива и сообщите,
        для какого из массивов это значение оказалось больше
        (либо сообщите, что их средние арифметические равны)*/
public class Task5 {
    public static void main(String[] args) {

        Random random = new Random();
        int[] oneArrival = new int[5];
        int[] twoArrival = new int[5];

        for (int i = 0; i < 5; i++) {
            oneArrival[i] = random.nextInt(6);
            twoArrival[i] = random.nextInt(6);
        }


        for (int i = 0; i < 5; i++) {
            System.out.print(oneArrival[i] + " ");
        }
        System.out.println("");

        for (int i = 0; i < 5; i++) {
            System.out.print(twoArrival[i] + " ");

        }

        int oneArrivalSumm = 0;
        int twoArrivalSumm = 0;


        for (int i = 0; i < 5; i++) {
            oneArrivalSumm = oneArrival[i] + oneArrivalSumm;
            twoArrivalSumm = twoArrival[i] + twoArrivalSumm;
        }

        double oneAverage = (double) oneArrivalSumm / 5;
        double twoAverage = (double) twoArrivalSumm / 5;


        if (oneAverage > twoAverage) {
            System.out.println("\nСреднее афифметическое чисел первого массива " + oneAverage + " и оно больше");
        } else if (oneAverage < twoAverage) {
            System.out.println("\nСреднее афифметическое чисел второго массива " + twoAverage + " и оно больше");
        } else {
            System.out.println("\nСреднее афифметическое чисел массивов равное");
        }
    }
}
