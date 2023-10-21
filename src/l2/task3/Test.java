package l2.task3;

public class Test {
    public static void main(String[] args) {
        Point point1 = new Point(0, 0);
        Point point2 = new Point(3, 4);
        Point point3 = new Point(-2, -1);

        Circle circle1 = new Circle(point1, 1);
        Circle circle2 = new Circle(point2, 4);
        Circle circle3 = new Circle(point3, 9);

        Tester tester = new Tester(new Circle[]{circle1, circle2, circle3}, 3);
        System.out.println(tester);
    }
}
