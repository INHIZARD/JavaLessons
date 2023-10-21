package lesson18.task7;

public class Solution {
    public static void main(String[] args) {
        try {
            ThrowsDemo throwsDemo = new ThrowsDemo();
            throwsDemo.getKey();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
