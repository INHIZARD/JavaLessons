package lesson18.task4;

import java.util.Scanner;

public class Exception4 {
    public static void exceptionDemo() {
        try (Scanner myScanner = new Scanner( System.in)) {
            System.out.print("Enter an integer ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("Program completed!");
        }
    }
}
