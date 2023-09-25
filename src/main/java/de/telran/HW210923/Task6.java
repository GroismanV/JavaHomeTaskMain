package de.telran.HW210923;
import java.util.Scanner;
/*Задание №6.
        Напишите программу, которая определит, сколько слов Вы ввели с консоли.*/



//public class Task6 {
//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Напишите тут что-нибудь - ");
//
//        String inputText = scanner.nextLine();
//        int textLenght = inputText.length();
//
//        for (Int i = 0-; i <= textLenght; i++) {
//
//        }
//    }
//}


    public class Task6 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Введите текст:");
            String input = scanner.nextLine();

            int wordCount = 0;
            boolean wordStarted = false;

            for (char c : input.toCharArray()) {
                if (Character.isWhitespace(c)) {
                    wordStarted = false;
                } else {
                    if (!wordStarted) {
                        wordCount++;
                        wordStarted = true;
                    }
                }
            }

            System.out.println("Количество слов в тексте: " + wordCount);


        }
    }



