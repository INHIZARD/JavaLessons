package lesson2.task10;

import java.util.Objects;
import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {
        System.out.println("Введите строчку");
        try (Scanner scanner = new Scanner(System.in)){
            String line = scanner.nextLine();
            System.out.printf("Слов в строчке: %d\n", Objects.equals(line, "") ? 0 : line.split(" ").length);
        }
        catch (Exception e){
            System.out.println("Ошибка ввода");
        }
    }
}
