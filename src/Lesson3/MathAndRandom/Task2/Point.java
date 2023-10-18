package Lesson3.MathAndRandom.Task2;

public class Point implements Cloneable {
    private int x;
    private int y;

    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    Point(){
        x = (int) (Math.random() * 10) - 5;
        y = (int) (Math.random() * 10) - 5;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    protected Point clone() throws CloneNotSupportedException {
        return (Point) super.clone();
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
