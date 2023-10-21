package l2.task6;

public class CircleTest {
    public static void main(String[] args) {
        try {
            Circle circle1 = new Circle(new Circle.Point(0, 0), 10);
            System.out.printf("Первая окружность: %s\n", circle1);
            System.out.printf("Длина окружности равна %f\nПлощадь окружности равна %f\n",
                    circle1.getLength(), circle1.getArea());
            Circle circle2 = new Circle(new Circle.Point(1, 1), 4);
            System.out.printf("Вторая окружность: %s\n", circle2);
            System.out.printf("Длина окружности равна %f\nПлощадь окружности равна %f\n",
                    circle2.getLength(), circle2.getArea());
            System.out.printf("Равна ли первая окружность второй? %b\n", circle1.equals(circle2));
            System.out.println("Изменим свойства второй окружности на свойства первой");
            circle2.setCenter(circle1.getCenter());
            circle2.setRadius(circle1.getRadius());
            System.out.printf("Равна ли первая окружность второй? %b\n", circle1.equals(circle2));
        }
        catch (CloneNotSupportedException e){
            System.out.println(e.getMessage());
        }
    }
}
