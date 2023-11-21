package lesson20.task3;

import java.io.Serializable;

public class Example<T extends Comparable<T>, V extends Animal & Serializable, K> {
    private T firstVariable;
    private V secondVariable;
    private K thirdVariable;

    Example(T firstVariable, V secondVariable, K thirdVariable) {
        this.firstVariable = firstVariable;
        this.secondVariable = secondVariable;
        this.thirdVariable = thirdVariable;
    }

    public T getFirstVariable() {
        return firstVariable;
    }

    public V getSecondVariable() {
        return secondVariable;
    }

    public K getThirdVariable() {
        return thirdVariable;
    }

    public void classFirstVariable() {
        System.out.println(firstVariable.getClass());
    }

    public void classSecondVariable() {
        System.out.println(secondVariable.getClass());
    }

    public void classThirdVariable() {
        System.out.println(thirdVariable.getClass());
    }
}
