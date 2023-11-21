package lesson20.task6;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> intMatrix = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            intMatrix.add(new ArrayList<>());
            for (int j = 0; j < 5; j++) {
                intMatrix.get(i).add((int) (Math.random() * 10));
            }
        }
        Matrix<Integer> matrix1 = new Matrix<>(intMatrix);
        System.out.println(matrix1);
        matrix1.transposition();
        System.out.println(matrix1);
    }
}
