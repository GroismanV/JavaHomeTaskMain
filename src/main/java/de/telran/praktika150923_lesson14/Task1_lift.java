package de.telran.praktika150923_lesson14;
    /*
    вас на банковском счету N долларов.
            Вы хотите снять все, но банк разрешает снять только сумму, которая
            является делителем текущей суммы на счету и меньше текущей суммы.
            Если вы снимаете максимально возможную сумму каждый день, сколько
            дней вам понадобится, чтобы забрать все свои деньги из банка?
            Примечание: если оставшаяся сумма равна 1, вы можете снять ее.
            Ввод: N = 21
            Выход: 7
            Объяснение: N = 21
            Снято 7, осталось = 14
            Снято 7, осталось = 7
            Снято 1, осталось = 6
            Снято 3, осталось = 3
            Снято 1, осталось = 2
            Снято 1, Осталось = 1
            Снято 1, осталось = 0
    */

public class Task1_lift {
    public static void main(String[] args) {
        int H = 200;
        int N = 50;
        int M = 1;

        int liftsNeeded = numberOfLifts(H, N, M);
        System.out.println("Количество подъемов, необходимых лифту: " + liftsNeeded);
    }

// Этот код определяет метод numberOfLifts, который принимает в качестве параметров высоту здания floor,
// количество этажей для подъема stepUp и количество этажей для спуска stepDown. Он использует цикл,
// чтобы моделировать подъемы и спуски лифта, пока он не достигнет верхнего этажа floor.
// Количество подъемов увеличивается с каждой итерацией цикла, и когда текущий этаж превышает общее количество этажей,
// мы завершаем выполнение цикла и возвращаем количество подъемов.


    public static int numberOfLifts(int floor, int stepUp, int stepDown) {
        int lifts = 0;
        int currentFloor = 0;

        while (currentFloor < floor) {
            // Поднимаемся на N этажей
            currentFloor += stepUp;
            lifts++;

            // Если текущий этаж превысил общее количество этажей, выходим из цикла
            if (currentFloor >= floor) {
                break;
            }

            // Спускаемся на M этажей
            currentFloor -= stepDown;
        }
        return lifts;
    }
}

