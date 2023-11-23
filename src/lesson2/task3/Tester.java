package lesson2.task3;

import java.util.Arrays;

public class Tester {
    private Circle[] circles;
    private int countOfCircles;

    Tester(Circle[] circles, int countOfCircles) {
        this.circles = circles;
        this.countOfCircles = countOfCircles;
    }

    public Circle[] getCircles() {
        return circles;
    }

    public void setCircles(Circle[] circles) {
        this.circles = circles;
    }

    public int getCountOfCircles() {
        return countOfCircles;
    }

    public void setCountOfCircles(int countOfCircles) {
        this.countOfCircles = countOfCircles;
    }

    @Override
    public String toString() {
        return "Tester{\n" +
                "circles=" + Arrays.toString(circles) +
                ",\ncountOfCircles=" + countOfCircles +
                "\n}";
    }
}
