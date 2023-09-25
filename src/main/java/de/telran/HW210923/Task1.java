package de.telran.HW210923;

import java.util.Arrays;

/*1 уровень сложности: Задание №1
        Напишите программу, которая меняет местами элементы одномерного массива из String в обратном порядке.
        Не используйте дополнительный массив для хранения результатов.*/
public class Task1 {
    public static void main(String[] args) {

        String[] strings = {"три","четырнадцать","пятнадцать","девяносто","два","шесть"};

        for (int i = 0; i < strings.length / 2; i++) {
            String tempString = strings[i];
            strings[i] = strings[strings.length - 1 - i];
            strings[strings.length - 1 - i] = tempString;
        }

        System.out.println(Arrays.toString(strings));
    }
}
