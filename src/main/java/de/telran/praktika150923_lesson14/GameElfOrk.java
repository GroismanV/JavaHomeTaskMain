package de.telran.praktika150923_lesson14;

import java.util.Scanner;

public class GameElfOrk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice;

        while (true) {
            displayMenu();
            choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.println("Вы выбрали Elf");
                    break;
                case "2":
                    System.out.println("Вы выбрали Orc");
                    break;
                case "3":
                    System.out.println("Выход из игры.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Выберите один из вариантов (1, 2 или 3)");
            }
        }
    }

    // Функция для отображения меню выбора
    private static void displayMenu() {
        System.out.println("1. Elf");
        System.out.println("2. Orc");
        System.out.println("3. Exit");
        System.out.print("Выберите персонажа (1 - Elf, 2 - Orc, 3 - Exit): ");
    }
}