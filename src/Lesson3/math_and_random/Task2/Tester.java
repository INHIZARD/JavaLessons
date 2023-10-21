package lesson3.math_and_random.task2;

import java.util.Arrays;
import java.util.Comparator;

public class Tester{
    private Circle[] circles;
    private int countOfCircles;

    Tester(int countOfCircles){
        circles = new Circle[countOfCircles];
        for (int i = 0; i < countOfCircles; i++) circles[i] = new Circle();
        this.countOfCircles = countOfCircles;
    }

    public Circle[] getCircles() {
        return circles;
    }

    public int getCountOfCircles() {
        return countOfCircles;
    }

    public Circle findTheBiggestCircle() throws CloneNotSupportedException {
        Circle theBiggest = new Circle(new Point(), 0);
        for (Circle circle: circles){
            if (circle.getRadius() > theBiggest.getRadius()) theBiggest = circle;
        }
        return theBiggest.clone();
    }

    public Circle findTheSmallestCircle() throws CloneNotSupportedException {
        Circle theSmallest = new Circle(new Point(), 30);
        for (Circle circle : circles) {
            if (circle.getRadius() < theSmallest.getRadius()) theSmallest = circle;
        }
        return theSmallest.clone();
    }

    public void sort(){
        Arrays.sort(circles, Comparator.comparingInt(Circle::getRadius));
    }

    @Override
    public String toString() {
        return Arrays.toString(circles);
    }
}
