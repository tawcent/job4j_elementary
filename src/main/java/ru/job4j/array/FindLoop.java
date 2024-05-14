package ru.job4j.array;

public class FindLoop {
    public static int indexOf(int[] data, int element) {
        int result = -1;
        for (int index = 0; index <= 10; index++) {
            if (data[index] == element) {
                result = index;
                break;
            } else return result;
        }
        return result;
    }
}