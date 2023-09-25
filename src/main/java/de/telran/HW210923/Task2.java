package de.telran.HW210923;
/*    Задание №2
    Пользователь должен ввести с клавиатуры размер массива - натуральное число больше 3.
    Введенное пользователем число сохраняется в переменную n.
    Если пользователь ввёл не подходящее число, то программа должна просить пользователя повторить ввод.
    Создать массив из n случайных целых чисел из отрезка [0;n] и вывести его на экран.
    Создать второй массив только из чётных элементов первого массива, если они там есть, и вывести его на экран.*/

import java.util.Random;
import java.util.Scanner;

public class Task2 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        int n = 0;

        while (n <= 3) {
            System.out.println("Введите длину массива-натуральное число больше 3: ");
            n = scanner.nextInt();
        }
        int[] numberArray = new int[n];

        for (int i = 0; i < n; i++) {
            numberArray[i] = random.nextInt(n + 1);

        }

        System.out.println("Полученный массив случайных чисел - ");
        for (int i = 0; i < n; i++) {
            System.out.print(numberArray[i] + " ");

        }
        int halfNummerArray = n / 2 + 1;
        int[] evenNumberArray = new int[halfNummerArray];

        System.out.println();
        System.out.println("Полученный массив из чётных элементов предыдущего массива - ");

        int y = 0;
        for (int i = 0; i <= n - 1; i += 2) {
            evenNumberArray[y] = numberArray[i];
            System.out.print(evenNumberArray[y] + " ");
            y++;

        }

    }
}

