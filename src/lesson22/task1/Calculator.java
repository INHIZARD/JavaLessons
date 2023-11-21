package lesson22.task1;

import java.util.EmptyStackException;
import java.util.Objects;
import java.util.Stack;

public class Calculator {
    public static double calculate(String line) {
        Stack<String> elements = new Stack<>();
        for (String elem: line.split(" ")) {
            elements.push(elem);
        }
        try {
            Stack<String> operators = new Stack<>();
            Stack<Double> numbers = new Stack<>();
            String elem;
            while (elements.size() != 1) {
                elem = elements.pop();
                if (Objects.equals(elem, "+") || Objects.equals(elem, "-")
                        || Objects.equals(elem, "*") || Objects.equals(elem, "/")) {
                    operators.push(elem);
                }
                else {
                    double number1 = Double.parseDouble(elem);
                    double number2 = Double.parseDouble(elements.pop());
                    if (operators.isEmpty()) {
                        throw new InputElementsException();
                    }
                    switch (operators.pop()) {
                        case "+" -> elements.push(String.valueOf(number2 + number1));
                        case "-" -> elements.push(String.valueOf(number2 - number1));
                        case "*" -> elements.push(String.valueOf(number2 * number1));
                        case "/" -> elements.push(String.valueOf(number2 / number1));
                    }
                }
            }
        }
        catch (NumberFormatException | EmptyStackException e) {
            new InputElementsException().printStackTrace();
        } catch (InputElementsException e) {
            e.printStackTrace();
        }
        return Double.parseDouble(elements.pop());
    }
}
