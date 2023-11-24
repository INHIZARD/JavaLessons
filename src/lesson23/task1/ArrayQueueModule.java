package lesson23.task1;

import java.util.Arrays;

public class ArrayQueueModule {
    private static int size = 0;
    private static Object[] queue = new Object[size];

    public static void enqueue(Object element) {
        assert element != null;
        queue = Arrays.copyOf(queue, ++size);
        queue[size - 1] = element;
    }

    public static Object element() {
        assert size > 0;
        return queue[0];
    }

    public static Object dequeue() {
        assert size > 0;
        Object element = queue[0];
        queue = Arrays.copyOfRange(queue, 1, size--);
        return element;
    }

    public static int size() {
        return size;
    }

    public static boolean isEmpty() {
        return size == 0;
    }

    public static void clear() {
        size = 0;
        queue = new Object[size];
    }
}
