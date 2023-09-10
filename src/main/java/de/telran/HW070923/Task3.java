package de.telran.HW070923;

public class Task3 {
    public static void main(String[] args) {
        int temperature1 = 30;
        int temperature2 = 80;

        boolean deviceStatus = checkDevice(temperature1, temperature2);

        System.out.println("Проверка устройства: " + deviceStatus);
    }

    public static boolean checkDevice(int temperature1, int temperature2) {
        boolean deviceStatus = false;

        if (temperature1 > 100 && temperature2 < 100) {
            deviceStatus = true;
        }

        return deviceStatus;
    }
}
