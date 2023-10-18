package Lesson2.Task5;

public class Dog {
    private String name;
    private int age;

    Dog(String name, int age) throws Exception {
        if (age < 0) throw new Exception("Неверный возраст для " + name);
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int convertAge(){
        return age * 7;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
