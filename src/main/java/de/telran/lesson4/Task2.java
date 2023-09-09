public class Task2 {

    public static void main(String[] args) {
        // Вызовите все методы в main
        int a = 10;
        int b = 5;
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("a + b = " + add(a, b));
        System.out.println("a - b = " + subtract(a, b));
        System.out.println("a * b = " + multiply(a, b));
        System.out.println("a / b = " + divide(a, b));
    }

    // Создайте методы с математическими операциями +, -, *, /
    // Каждый метод принимает два числа в параметрах и возвращает
    // результат

    public static int add(int x, int y) {
        return x + y;
    }

    public static int subtract(int x, int y) {
        return x - y;
    }

    public static int multiply(int x, int y) {
        return x * y;
    }

    public static int divide(int x, int y) {
        return x / y;
    }
}