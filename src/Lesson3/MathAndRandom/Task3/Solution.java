package Lesson3.MathAndRandom.Task3;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] array = new int[4];
        boolean increase = true;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 90) + 10;
            if (i != 0 && array[i] <= array[i - 1]) increase = false;
        }
        System.out.printf("Массив: %s\n", Arrays.toString(array));
        if (increase) System.out.println("Массив — строго возрастающая последовательность");
        else System.out.println("Массив не является строго возрастающей последовательностью");
    }
}
