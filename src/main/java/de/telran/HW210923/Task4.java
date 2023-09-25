package de.telran.HW210923;

import java.util.Random;

/*Задание №4.
        Создайте массив из 8 случайных целых чисел из отрезка [1;10]
        Выведите массив на экран в строку
        Замените каждый элемент с нечётным индексом на ноль
        Снова выведете массив на экран на отдельной строке*/
public class Task4 {
    public static void main(String[] args) {
        int[] arrivalTask4 = new int[8];
        Random random = new Random();

        System.out.println("Элементы массива ");
        for (int i = 0; i < arrivalTask4.length; i++) {
            arrivalTask4[i] = random.nextInt(10) + 1;
            System.out.print(+arrivalTask4[i] + " ");
        }

        System.out.println("");

        for (int i = 1; i <= arrivalTask4.length; i += 2) {
            arrivalTask4[i] = 0;
        }
        System.out.println("Элементы изменённого массива ");

        for (int i = 0; i < arrivalTask4.length; i++) {
            System.out.print(arrivalTask4[i] + " ");

        }

    }

}
