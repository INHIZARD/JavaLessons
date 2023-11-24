package lesson23.task1;

import java.util.Arrays;

public class ArrayQueueADT {
    private int size = 0;
    private Object[] queue = new Object[size];

    public static void enqueue(ArrayQueueADT queueADT, Object element) {
        assert element != null;
        queueADT.queue = Arrays.copyOf(queueADT.queue, ++queueADT.size);
        queueADT.queue[queueADT.size - 1] = element;
    }

    public static Object element(ArrayQueueADT queueADT) {
        assert queueADT.size > 0;
        return queueADT.queue[0];
    }

    public static Object dequeue(ArrayQueueADT queueADT) {
        assert queueADT.size > 0;
        Object element = queueADT.queue[0];
        queueADT.queue = Arrays.copyOfRange(queueADT.queue, 1, queueADT.size--);
        return element;
    }

    public static int size(ArrayQueueADT queueADT) {
        return queueADT.size;
    }

    public static boolean isEmpty(ArrayQueueADT queueADT) {
        return queueADT.size == 0;
    }

    public static void clear(ArrayQueueADT queueADT) {
        queueADT.size = 0;
        queueADT.queue = new Object[queueADT.size];
    }
}
