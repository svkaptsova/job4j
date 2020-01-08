package ru.job4j.loop;

public class PrimeNumber {
    public int calc(int finish) {
        int count = 0;
        for (int a = 0; a <= finish; a++) {
            if (a <= 1) {
                continue;
            }
            if (CheckPrimeNumber.check(a)) {
                count += 1;
            }
        }
        return count;
    }
}
