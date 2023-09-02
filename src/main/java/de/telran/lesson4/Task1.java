public class Task1 {

        public static void main(String[] args) {
            // Создайте строку через new - I study Basic Java!
            String str = new String("I study Basic Java!");

            // Напишите метод, который принимает в качестве параметра строку, передайте в
            // этот метод строку, которую создали в п.1
            printString(str);
        }

        public static void printString(String s) {
            // Распечатать пред-последний символ строки. Используем метод String.charAt().
            System.out.println("Пред-последний символ строки: " + s.charAt(s.length() - 2));

            // Проверить, содержит ли ваша строка подстроку “Java”. Используем метод
            // String.contains().
            System.out.println("Строка содержит подстроку Java: " + s.contains("Java"));

            // Вырезать строку Java c помощью метода String.substring().
            System.out.println("Строка без подстроки Java: " + s.substring(0, s.indexOf("Java")) + s.substring(s.indexOf("Java") + 4));

            // Заменить все символы “а” на “о”.
            System.out.println("Строка с заменой а на о: " + s.replace('a', 'o'));

            // Преобразуйте строку к верхнему регистру.
            System.out.println("Строка в верхнем регистре: " + s.toUpperCase());

            // Преобразуйте строку к нижнему регистру.
            System.out.println("Строка в нижнем регистре: " + s.toLowerCase());

        }
    }