package Lesson3.MathAndRandom.Task2;

public class Circle implements Cloneable{
    private Point center;
    private int radius;

    Circle(Point center, int radius){
        this.center = center;
        this.radius = radius;
    }

    Circle(){
        center = new Point();
        radius = (int) (Math.random() * 20) + 1;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    protected Circle clone() throws CloneNotSupportedException {
        Circle newCircle = (Circle) super.clone();
        newCircle.center = center.clone();
        return newCircle;
    }

    @Override
    public String toString() {
        return "Circle[center=" + center +
                ", radius=" + radius + "]";
    }
}
