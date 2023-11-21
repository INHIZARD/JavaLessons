package lesson20.task3;

public class Test {
    public static void main(String[] args) {
        Example<Integer, Animal, String> example =
                new Example<>(100, new Animal("Horse", 19), "Bob");
        System.out.printf("first variable: %s is ", example.getFirstVariable());
        example.classFirstVariable();
        System.out.printf("second variable: %s is ", example.getSecondVariable());
        example.classSecondVariable();
        System.out.printf("third variable: %s is ", example.getThirdVariable());
        example.classThirdVariable();
    }
}
