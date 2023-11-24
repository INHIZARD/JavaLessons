package lesson23.task1;

public class Test {
    public static void main(String[] args) {
        System.out.println("ArrayQueueModule test");
        System.out.println(ArrayQueueModule.size());
        ArrayQueueModule.enqueue(12);
        ArrayQueueModule.enqueue(321312);
        ArrayQueueModule.enqueue(90);
        System.out.println(ArrayQueueModule.size());
        System.out.println(ArrayQueueModule.dequeue());
        System.out.println(ArrayQueueModule.size());
        System.out.println(ArrayQueueModule.element());
        ArrayQueueModule.clear();
        System.out.println(ArrayQueueModule.isEmpty());

        System.out.println("\nArrayQueueADT test");
        ArrayQueueADT queueADT = new ArrayQueueADT();
        System.out.println(ArrayQueueADT.size(queueADT));
        ArrayQueueADT.enqueue(queueADT, 111);
        ArrayQueueADT.enqueue(queueADT, 2222);
        ArrayQueueADT.enqueue(queueADT, 33333);
        System.out.println(ArrayQueueADT.size(queueADT));
        System.out.println(ArrayQueueADT.dequeue(queueADT));
        System.out.println(ArrayQueueADT.size(queueADT));
        System.out.println(ArrayQueueADT.element(queueADT));
        ArrayQueueADT.clear(queueADT);
        System.out.println(ArrayQueueADT.isEmpty(queueADT));

        System.out.println("\nArrayQueue test");
        ArrayQueue queue = new ArrayQueue();
        System.out.println(queue.size());
        queue.enqueue( 45);
        queue.enqueue(67);
        queue.enqueue(89);
        System.out.println(queue.size());
        System.out.println(queue.dequeue());
        System.out.println(queue.size());
        System.out.println(queue.element());
        queue.clear();
        System.out.println(queue.isEmpty());
    }
}
