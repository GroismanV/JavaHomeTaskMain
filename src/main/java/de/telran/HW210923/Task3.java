package de.telran.HW210923;

import java.util.Random;

/*Задание №3
        Создайте массив из 12 случайных целых чисел из отрезка [-15;15].
        Определите какой элемент является в этом массиве максимальным и
        сообщите индекс его последнего вхождения в массив.*/
public class Task3 {
    public static void main(String[] args) {
        int[] arrivalTask3 = new int[12];
        Random random = new Random();
        for (int i = 0; i < 12; i++) {
            arrivalTask3[i] = random.nextInt(31) - 15;
        }
        int maxIndexTemp = arrivalTask3[0];

        for (int i = 1; i < 12; i++) {
            if (arrivalTask3[i] >= maxIndexTemp) {
                maxIndexTemp = i;
            }
        }
        System.out.println("Индекс максимального элемента последнего вхождения - " + maxIndexTemp);

    }

}
