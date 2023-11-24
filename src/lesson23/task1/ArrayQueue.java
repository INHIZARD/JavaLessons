package lesson23.task1;

import java.util.Arrays;

public class ArrayQueue {
    private int size = 0;
    private Object[] queue = new Object[size];

    public void enqueue(Object element) {
        assert element != null;
        queue = Arrays.copyOf(queue, ++size);
        queue[size - 1] = element;
    }

    public Object element() {
        assert size > 0;
        return queue[0];
    }

    public Object dequeue() {
        assert size > 0;
        Object element = queue[0];
        queue = Arrays.copyOfRange(queue, 1, size--);
        return element;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        size = 0;
        queue = new Object[size];
    }
}
