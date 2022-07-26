package ru.netology.sqr;

public class SQRService {
    public int countSquaresInRange(int a, int b) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= a && i * i <= b) {
                count++;
            }
        }
        return count;
    }
}
