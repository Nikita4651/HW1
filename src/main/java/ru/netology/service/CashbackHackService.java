package ru.netology.service;

 public class CashbackHackService {
    private final int boundary = 1000;

     public int remain(int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Сумма не может быть отрицательной");
        }

        int remainder = amount % boundary;
        if (remainder == 0) {
            return 0;
        } else {
            return boundary - remainder;
        }
    }
}
