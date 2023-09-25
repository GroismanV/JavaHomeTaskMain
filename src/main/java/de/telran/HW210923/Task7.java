package de.telran.HW210923;

import java.util.Arrays;
import java.util.Random;
              /*Задание №7.
        Создайте массив из 5случайных целых чисел из интервала[10;99]

        Выведите его на консоль в строку.

        Определите и выведите на экран сообщение о том,является ли
        массив строго возрастающей последовательностью(каждый элемент строго больше предыдущего)

        */

public class Task7 {
    public static void main(String[] args) {

        Random random = new Random();
        int[] arrayTask7 = new int[5];

        // для самотестирования
        // int arrayTask7[]= {1,2,3,4,5};

        for (int i = 0; i < 5; i++) {
            ;
            arrayTask7[i] = random.nextInt(90) + 10;
        }

        System.out.println("Элементы массива " + Arrays.toString(arrayTask7));


        boolean isIncreasing = false;
        for (int i = 1; i < arrayTask7.length; i++) {
            if (arrayTask7[i] <= arrayTask7[i - 1]) {
                isIncreasing = false;
                break;
            }
        }
        if (isIncreasing) {
            System.out.println("Массив является строго возрастающей последовательностью.");
        } else {
            System.out.println("Массив не является строго возрастающей последовательностью.");
        }

    }
}



