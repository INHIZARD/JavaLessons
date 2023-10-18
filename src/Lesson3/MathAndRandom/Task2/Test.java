package Lesson3.MathAndRandom.Task2;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Tester circles1 = new Tester(5);
        System.out.printf("Массив окружностей: %s\n", circles1);
        System.out.printf("Самая большая окружность: %s\n", circles1.findTheBiggestCircle());
        System.out.printf("Самая маленькая окружность: %s\n", circles1.findTheSmallestCircle());
        circles1.sort();
        System.out.printf("Отсортированный массив окружностей: %s\n", circles1);
    }
}
