package lesson22.task1;

public class Test {
    public static void main(String[] args) {
        System.out.println(Calculator.calculate("2 3 4 5 + - +"));
        System.out.println(Calculator.calculate("2 3 4 5 / * +"));
        System.out.println(Calculator.calculate("1 1 /"));
        System.out.println(Calculator.calculate("1 0 /"));
    }
}
