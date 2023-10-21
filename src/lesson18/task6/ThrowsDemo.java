package lesson18.task6;

public class ThrowsDemo {
    private void getDetails(String key) {
        if (key == null) {
            throw new NullPointerException("null key in getDetails");
        }
    }
    public void printMessage(String message) {
        try {
            getDetails(message);
            System.out.println(message);
        }
        catch (NullPointerException e) {
            e.printStackTrace();
        }
    }
}
