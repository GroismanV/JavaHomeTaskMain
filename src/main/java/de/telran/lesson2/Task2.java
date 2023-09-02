package de.telran.lesson2;

public class Task2 {
    public static void main(String[] args) {
        int abc=569;
        int a=abc/100; //результат сотни

        int b=(abc-a*100)/10; //результат десятки

        int c=abc-(a*100+b*10);  //результат единицы

        System.out.println("Число "+a+b+c+ "->" + a+","+b+","+c);
    }
}
