package lesson1.task4;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);){
            System.out.println("Введите 5 чисел массива:");
            int[] numbers = new int[5];
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = scanner.nextInt();
            }

            int it = 0;
            int maxValue = Integer.MIN_VALUE;
            int minValue = Integer.MAX_VALUE;
            int sum = 0;
            while (it != numbers.length) {
                if (numbers[it] > maxValue) maxValue = numbers[it];
                if (numbers[it] < minValue) minValue = numbers[it];
                sum += numbers[it];
                it++;
            }
            System.out.printf("""
                    Сумма чисел в массиве: %d
                    Минимальное число в массиве: %d
                    Максимальное число в массиве:: %d""", sum, minValue, maxValue);
        }
        catch (Exception e) {
            System.out.println("Ошибка ввода");
        }
    }
}
