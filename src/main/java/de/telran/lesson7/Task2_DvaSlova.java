package de.telran.lesson7;

import java.util.Scanner;

public class Task2_DvaSlova {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два слова, состоящие из четного количества букв:");
        String word1 = scanner.next();
        String word2 = scanner.next();
        if (word1.length() % 2 == 0 && word2.length() % 2 == 0) {
            String firstHalfWord1 = word1.substring(0, word1.length() / 2);
            String secondHalfWord2 = word2.substring(word2.length() / 2);
            System.out.println(firstHalfWord1 + secondHalfWord2);
        } else {
            System.out.println("Вы ввели некорректные данные.");
        }
    }
}

