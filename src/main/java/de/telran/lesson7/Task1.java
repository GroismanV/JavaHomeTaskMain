package de.telran.lesson7;

public class Task1 {

        public static void main(String[] args) {
            String str = new String("I study Basic Java!");
            System.out.println("Строка: " + str);
            lastChar(str);
            containsJava(str);
            replaceAwithO(str);
            upperCase(str);
            lowerCase(str);
            cutJava(str);
        }

        public static void lastChar(String str) {
            System.out.println("Последний символ строки: " + str.charAt(str.length() - 1));
        }

        public static void containsJava(String str) {
            System.out.println("Содержит ли строка подстроку 'Java': " + str.contains("Java"));
        }

        public static void replaceAwithO(String str) {
            System.out.println("Заменяем все символы 'a' на 'o': " + str.replace('a', 'o'));
        }

        public static void upperCase(String str) {
            System.out.println("Строка в верхнем регистре: " + str.toUpperCase());
        }

        public static void lowerCase(String str) {
            System.out.println("Строка в нижнем регистре: " + str.toLowerCase());
        }

        public static void cutJava(String str) {
            System.out.println("Вырезаем подстроку 'Java': " + str.substring(0, str.indexOf("Java")) + str.substring(str.indexOf("Java") + 4));
        }
    }
