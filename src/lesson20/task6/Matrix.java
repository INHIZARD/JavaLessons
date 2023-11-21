package lesson20.task6;

import java.util.ArrayList;

public class Matrix<E> {
    private ArrayList<ArrayList<E>> matrix;
    private int rows;
    private int cols;

    Matrix(ArrayList<ArrayList<E>> matrix) {
        this.matrix = matrix;
        rows = matrix.size();
        if (rows == 0) {
            cols = 0;
        }
        else {
            cols = matrix.get(0).size();
        }
    }

    public void transposition() {
        ArrayList<ArrayList<E>> tMatrix = new ArrayList<>();
        for (int i = 0; i < cols; i++) {
            tMatrix.add(new ArrayList<>());
            for (int j = 0; j < rows; j++) {
                tMatrix.get(i).add(matrix.get(j).get(i));
            }
        }
        matrix = tMatrix;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (var row: matrix) {
            for (var val: row) {
                s.append(val).append(" ");
            }
            s.append("\n");
        }
        return s.toString();
    }
}
