package lesson20.task4;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        MinMax<Integer> minMax1 = new MinMax<>(new Integer[] {2, 4, 5, 1, 9, 4, 8, 1, 2, 0, 2, 9});
        System.out.println(Arrays.toString(minMax1.getArray()));
        System.out.printf("min1: %s\nmax1: %s\n", minMax1.min(), minMax1.max());

        MinMax<String> minMax2 = new MinMax<>(new String[] {"a", "ab", "b", "c", "zwe", "bra", "abw", "12"});
        System.out.println(Arrays.toString(minMax2.getArray()));
        System.out.printf("min2: %s\nmax2: %s\n", minMax2.min(), minMax2.max());
    }
}
