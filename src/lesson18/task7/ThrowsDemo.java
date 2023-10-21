package lesson18.task7;

import java.util.Scanner;

public class ThrowsDemo {
    public void getKey() {
        try (Scanner myScanner = new Scanner(System.in)) {
            String key = myScanner.nextLine();
            printDetails(key);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void printDetails(String key) throws Exception {
        String message = getDetails(key);
        System.out.println(message);
    }

    private String getDetails(String key) throws Exception {
        if (key.isEmpty()) {
            throw new Exception("Key set to empty string");
        }
        return "data for " + key;
    }
}

