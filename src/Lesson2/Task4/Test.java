package lesson2.task4;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Shop shop = new Shop();
        boolean open = true;
        System.out.println("Магазин компьютеров открыт!");
        System.out.print("""
                Доступные действия:
                1. Добавить компьютер
                2. Удалить компьютер
                3. Найти компьютер
                4. Посмотреть содержание магазина
                5. Закрыть магазин
                """);
        while (open){
            System.out.print("\nВведите действие: ");
            try (Scanner scanner = new Scanner(System.in)) {
                int action = scanner.nextInt();
                String name;
                int price;
                switch (action) {
                    case 1 -> {
                        System.out.print("Введите название компьютера: ");
                        name = scanner.next();
                        System.out.print("Введите цену компьютера: ");
                        price = scanner.nextInt();
                        shop.addComputer(new Computer(name, price));
                    }
                    case 2 -> {
                        System.out.print("Введите название компьютера: ");
                        name = scanner.next();
                        System.out.print("Введите цену компьютера: ");
                        price = scanner.nextInt();
                        shop.deleteComputer(new Computer(name, price));
                    }
                    case 3 -> {
                        System.out.print("""
                            Доступные действия:
                            1. Поиск по названию
                            2. Поиск по цене
                            3. Поиск по названию и цене
                            """);
                        System.out.print("\nВыберите действие: ");
                        try {
                            int findAction = scanner.nextInt();
                            switch (findAction){
                                case 1 -> {
                                    System.out.print("Введите название компьютера: ");
                                    name = scanner.next();
                                    System.out.printf("Найденные компьютеры:\n%s\n", shop.findComputer(name));
                                }
                                case 2 -> {
                                    System.out.print("Введите цену компьютера: ");
                                    price = scanner.nextInt();
                                    System.out.printf("Найденные компьютеры:\n%s\n", shop.findComputer(price));
                                }
                                case 3 -> {
                                    System.out.print("Введите название компьютера: ");
                                    name = scanner.next();
                                    System.out.print("Введите цену компьютера: ");
                                    price = scanner.nextInt();
                                    System.out.printf("Найденные компьютеры:\n%s\n",
                                            shop.findComputer(new Computer(name, price)));
                                }
                            }
                        }
                        catch (Exception e){
                            System.out.println("Неверное действие!");
                        }
                    }
                    case 4 -> System.out.println(shop);
                    case 5 -> open = false;
                    default -> System.out.println("Неверное действие");
                }
            }
            catch (Exception e){
                System.out.println("Неверное действие ");
            }
        }
    }
}
