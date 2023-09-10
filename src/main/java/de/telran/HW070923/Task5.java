package de.telran.HW070923;
//** Напишите программу, которая вычисляет, сколько лишних калорий будет,
// если вместо пиццы диаметром 24 см вы купите пиццу диаметром 28 см.
//  Чтобы решить эту проблему, предположим, что каждый квадратный сантиметр пиццы содержит 40 калорий.
// ==========================================================================================================
// Площадь круга можно рассчитать по формуле: S = π * r^2
//
//        где S - площадь круга, π (пи) - математическая константа, приближенное значение которой равно 3.14159, а r - радиус круга.
//
//        Таким образом, чтобы найти площадь круга, нужно возвести радиус в квадрат, умножить его на π.


public class Task5 {
    public static void main(String[] args) {
        int radiusSmall = 24 / 2;
        int radiusBig = 28 / 2;
        double areaOfCircleSmall = radiusSmall * radiusSmall * 3.14159;
        double areaOfCircleSmallBig = radiusBig * radiusBig * 3.14159;
        int extraCalories = (int) (40 * (areaOfCircleSmallBig - areaOfCircleSmall));
        System.out.println("Количество лишних колорий между этими пиццами составляет - " + extraCalories + "калорий");

    }

}
