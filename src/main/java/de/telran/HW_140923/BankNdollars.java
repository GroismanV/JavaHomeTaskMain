package de.telran.HW_140923;

public class BankNdollars {
         public static void main(String[] args) {
            int dollars = 21;
            int i = dollars - 1;

            while (dollars != 0) {
                if (dollars % i != 0 && i >= 1) {
                    i--;
                } else {
                    dollars = dollars - i;
                    System.out.println("Out - " + i + " Ballance - " + dollars);
                    i = dollars - 1;
                }
            }
            System.out.println("Out - " + i + " Ballance - " + dollars);
        }
    }
// ----------в коде ошибка деления на ноль, как исправить никак не получается-------------
