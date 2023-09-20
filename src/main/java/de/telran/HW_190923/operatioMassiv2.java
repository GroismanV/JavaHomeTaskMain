package de.telran.HW_190923;


       /* Создайте массив из 5 случайных целых чисел из интервала [10;99]

        Выведите его на консоль в строку.

        Определите и выведите на экран сообщение о том, является ли
        массив строго возрастающей последовательностью.*/

import java.util.Random;

public class operatioMassiv2 {

    public static void main(String[] args) {


        int min = 10;
        int max = 99;
        int elementMassiv = 5;
        int i;
        String arg;

        Random random = new Random();
        int[] massiv = new int[elementMassiv];

        for (i = 0; i < elementMassiv; i++) {

            massiv[i] = random.nextInt(max - min + 1) + min;

            System.out.print(massiv[i] + ".");

        }
        if ((massiv[0] < massiv[1]) && (massiv[1] < massiv[2]) && (massiv[2] < massiv[3]) && (massiv[3] < massiv[4])) {
             arg = "";
        }
        else arg = "НЕ";

        System.out.println(" Массив " + arg + " является строго возрастающей последовательностью.");
    }
}

