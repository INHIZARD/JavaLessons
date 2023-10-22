package lesson19.task1;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        DataInn dataInn = new DataInn();
        System.out.println("База данных ИНН:");
        System.out.println(dataInn.getInn().toString().replaceAll(" ", "\n"));

        System.out.print("\nВведите ИНН, по которому хотите найти пользователя: ");
        try (Scanner scanner = new Scanner(System.in)){
            String inn = scanner.nextLine();
            String name = dataInn.validInn(inn);
            System.out.printf("Пользователь %s имеет ИНН %s", name, inn);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
