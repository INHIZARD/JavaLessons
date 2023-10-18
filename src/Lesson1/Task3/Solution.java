package Lesson1.Task3;

public class Solution {
    public static void main(String[] args) {
        int[] array = {-1, 0, 1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.printf("Сумма чисел в массиве: %d\n", sum);
        System.out.printf("Среднее арифметическое чисел массива: %f", (double) sum / array.length);
    }
}
