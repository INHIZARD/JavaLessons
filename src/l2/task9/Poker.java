package l2.task9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Poker {
    public static void main(String[] args) {
        final String[] SUIT = {"Бубен", "Червей", "Пик", "Крести"};
        final String[] VALUE = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Валет", "Дама", "Король", "Туз"};
        final int CARDS_FOR_PLAYER = 5;

        List<String> cards = new ArrayList<>(SUIT.length * VALUE.length);
        for (String suit : SUIT) {
            for (String value : VALUE) {
                cards.add(value + " " + suit);
            }
        }
        Collections.shuffle(cards);

        System.out.print("Введите количество игроков: ");
        try (Scanner scanner = new Scanner(System.in)) {
            int players = scanner.nextInt();
            for (int i = 1; i <= players; i++) {
                System.out.printf("\nИгрок %d имеет следующие карты:\n", i);
                System.out.printf("%s\n",
                        String.join("\n", cards.subList((i - 1) * CARDS_FOR_PLAYER, i * CARDS_FOR_PLAYER)));
            }
        } catch (Exception e) {
            System.out.println("Ошибка ввода");
        }
    }
}
