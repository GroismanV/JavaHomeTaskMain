package de.telran.HW_070923;

public class Task2 {
    public static void main(String[] args) {
        boolean isEdekaOpen = true;
        boolean isReweOpen = false;

        if (isEdekaOpen==true || isReweOpen==true) {
            boolean canBuy= true;
            System.out.println("Я могу купить еду и это правда. ");
        } else {
            boolean canBuy= false;
            System.out.println("Я не могу купить еду. ");
        }
    }
}

