package lesson18.task2;

import java.util.Scanner;

public class Exception2 {
    public static void exceptionDemo() {
        try (Scanner myScanner = new Scanner( System.in)) {
            System.out.print("Enter an integer ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        }
        catch (NumberFormatException e) {
            System.out.println("Wrong number format");
        }
        catch (ArithmeticException e) {
            System.out.println("Attempted division by zero");
        }
    }
}
