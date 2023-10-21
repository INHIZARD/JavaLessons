package lesson18.task8;

import java.util.Scanner;

public class ThrowsDemo {
    public void getKey() {
        Scanner myScanner = new Scanner(System.in);
        try {
            String key = myScanner.nextLine();
            printDetails(key);
        }
        catch (Exception e1) {
            try {
                String key = myScanner.nextLine();
                printDetails(key);
            }
            catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        myScanner.close();
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

