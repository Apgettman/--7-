public class Main {
    public static void main(String[] args) {
        // ДЗ-7 Циклы Урок 1
        // Задание 1
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        // Задание 2
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
        // Задание 3
        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println(i);
        }
        // Задание 4
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
        // ДЗ-7 Циклы Урок 2
        // Задание 1
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является високосным!");
        }
        // Задание 2
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }
        // Задание 3
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }
        // ДЗ-7 Циклы Урок 3
        // Задание 1
        int postponed = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + postponed;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей!");
        }
        // Задание 2
        int postponedBank = 29000;
        int bank = 0;
        for (int i = 1; i <= 12; i++) {
            bank = bank + bank/100;
            bank = bank + postponedBank;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + bank + " рублей!");
        }
    }
}