package lesson3.math_and_random.task1;

import java.util.Arrays;
import java.util.Random;

public class Solution {

    private static final int LENGTH = 5;

    public static void main(String[] args) {
        System.out.println("Math.random()");
        double[] arr1 = new double[LENGTH];
        for (int i = 0; i < LENGTH; i++) {
            arr1[i] = Math.random() * 10;
        }
        System.out.printf("Массив случайных чисел: %s\n", Arrays.toString(arr1));
        Arrays.sort(arr1);
        System.out.printf("Отсортированный массив случайных чисел: %s\n", Arrays.toString(arr1));

        System.out.println("\nRandom()");
        double[] arr2 = new double[LENGTH];
        Random random = new Random();
        for (int i = 0; i < LENGTH; i++) {
            arr2[i] = random.nextDouble() * 10;
        }
        System.out.printf("Массив случайных чисел: %s\n", Arrays.toString(arr2));
        Arrays.sort(arr2);
        System.out.printf("Отсортированный массив случайных чисел: %s\n", Arrays.toString(arr2));
    }
}
