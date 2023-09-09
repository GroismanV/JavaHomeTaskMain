package de.telran.lesson7;

public class Task5_Converter {
    public static double convertEuroToUSD(double euroAmount) {
        double exchangeRate = 1.18; // Текущий обменный курс EUR/USD
        double usd = euroAmount * exchangeRate;
        return usd;
    }

    public static void main(String[] args) {
        double euroAmount = 100; // Указанная сумма в е

    }
}