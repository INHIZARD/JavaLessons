package lesson20.task3;

import java.io.Serializable;

public class Animal implements Serializable {
    private String name;
    private int age;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal " + name + " is " + age + " years old";
    }
}
