package lesson20.task4;

import java.util.Arrays;

public class MinMax<T extends Comparable<T>> {
    private T[] array;

    MinMax(T[] array) {
        this.array = array;
    }

    public T[] getArray() {
        return array;
    }

    public T min() {
        return Arrays.stream(array).min(Comparable::compareTo).orElse(null);
    }

    public T max() {
        return Arrays.stream(array).max(Comparable::compareTo).orElse(null);
    }
}
