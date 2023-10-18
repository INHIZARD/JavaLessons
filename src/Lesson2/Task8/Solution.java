package Lesson2.Task8;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        String[] lines = {"hello", "the", "best", "world"};
        System.out.printf("Массив до сортировки: %s\n", Arrays.toString(lines));

        String line;
        for (int i = 0; i < lines.length / 2; i++){
            line = lines[i];
            lines[i] = lines[lines.length - i - 1];
            lines[lines.length - i - 1] = line;
        }

        System.out.printf("Массив после сортировки: %s\n", Arrays.toString(lines));
    }
}
