package ru.netology;

public class Main {

    public static void main(String[] args) {
        int balance = 100;
        int topBalance = 1350;
        int bonus = 0;
        if (topBalance > 1000) bonus = topBalance / 100;
        balance += topBalance + bonus;
        System.out.println("Бонус за пополнение счета на " + topBalance + " рублей(я) равен: " + bonus);
        System.out.println("Итоговый баланс клиента: " + balance + " рублей(я)");
    }
}
