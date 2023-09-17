//package de.telran.HW070923;
//import java.util.Scanner;
//
//public class Task4 {
//    public static void main(String[] args) {
//        int realHourBisEnd ;
//        int realMinitsBisEnd ;
//        int secunden ;
//        int realSecundBisEnd;
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите текущее время часов(24 формат)- ");
//        int hourScan = scanner.nextInt();
//        System.out.print("Введите текущее время минут- ");
//        int minutsScan = scanner.nextInt();
//
////           if (hourScan=)
////           realHourBisEnd = (16-hourScan);
////            realMinitsBisEnd = (60 - minutsScan);
////            realSecundBisEnd =(realHourBisEnd*3600)+(realMinitsBisEnd*60);
////            //realSecundBisEnd = 28800 -secunden;
////            System.out.println("До конца рабочего дня осталось " + realHourBisEnd + " часов и "
////                    + realMinitsBisEnd + " минут или - " + realSecundBisEnd + " секунд");
////        }
////    }
//       if (minutsScan == 00) realMinitsBisEnd = 60;
//
//
//        realHourBisEnd=17-hourScan;
//        realMinitsBisEnd=60-minutsScan;
//        realSecundBisEnd=28800 -(realHourBisEnd*3600+realMinitsBisEnd*60);
//        System.out.println("До конца рабочего дня осталось " + realHourBisEnd + " часов и "
//                   + realMinitsBisEnd + " минут или - " + realSecundBisEnd + " секунд");
//       }
//   }
package de.telran.HW_070923;
import java.util.Random;

public class Task4
{
    public static void main(String[] args) {
        // Генерируем случайное число в диапазоне от 0 до 28800
        Random random = new Random();
        int n = random.nextInt(28801);

        System.out.println("Осталось " + n + " секунд");

        // Вычисляем количество полных часов
        int hours = n / 3600;

        if (hours >= 1) {
            System.out.println("Осталось " + hours + " часов");
        } else {
            System.out.println("Осталось менее часа");
        }
    }
}