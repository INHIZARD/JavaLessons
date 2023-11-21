package lesson20.task5;

public class Calculator {
    public static <T extends Number, V extends Number> double sum(T number1, V number2) {
        return number1.doubleValue() + number2.doubleValue();
    }

    public static <T extends Number, V extends Number> double multiply(T number1, V number2) {
        return number1.doubleValue() * number2.doubleValue();
    }

    public static <T extends Number, V extends Number> double divide(T number1, V number2) {
        return number1.doubleValue() / number2.doubleValue();
    }

    public static <T extends Number, V extends Number> double subtraction(T number1, V number2) {
        return number1.doubleValue() - number2.doubleValue();
    }
}
