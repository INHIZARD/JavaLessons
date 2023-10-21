package lesson1.task7;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите число, факториал которого хотите вычислить: ");
            int number = scanner.nextInt();
            if (number < 0) {
                throw new Exception();
            }
            System.out.printf("Факториал числа %d равен %d", number, Factorial.factorial(number));
        }
        catch (Exception e) {
            System.out.println("Ошибка ввода");
        }
    }
}
