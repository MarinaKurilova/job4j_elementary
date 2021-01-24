package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
            for (int i = 0; i < data.length - 1; i++) {
                result = data[0] == data[1] & data[0] == data[2];
            }
        return result;
    }
}
