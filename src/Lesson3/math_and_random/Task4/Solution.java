package lesson3.math_and_random.task4;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrayLength = length(scanner);
        scanner.close();

        int[] array = new int[arrayLength];
        int evenElements = 0;
        for (int i = 0; i < arrayLength; i++) {
            array[i] = (int) (Math.random() * (arrayLength + 1));
            if ((array[i] & 1) == 0) evenElements += 1;
        }
        System.out.printf("Массив: %s\n", Arrays.toString(array));

        int[] evenArray = new int[evenElements];
        int it = 0;
        for (int i = 0; i < arrayLength; i++) {
            if ((array[i] & 1) == 0) {
                evenArray[it] = array[i];
                it++;
            }
        }
        System.out.printf("Массив из четных элементов: %s\n", Arrays.toString(evenArray));
    }

    public static int length(Scanner scanner){
        System.out.print("Введите длину массива: ");
        try {
            int n = Integer.parseInt(scanner.nextLine());
            if (n < 0) throw new Exception();
            return n;
        }
        catch (Exception e) {
            System.out.println("Ошибка ввода");
            return length(scanner);
        }
    }
}
