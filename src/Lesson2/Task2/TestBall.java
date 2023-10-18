package Lesson2.Task2;

public class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball(1.0, 2.5);
        System.out.printf("""
                Координаты мяча до изменений:
                x = %f
                y = %f
                
                """, ball.getX(), ball.getY());

        ball.setX(2.0);
        ball.setY(3.0);
        System.out.printf("Данные мяча после первого изменения: %s\n\n", ball);

        ball.setXY(0, 0);
        System.out.printf("Данные мяча после второго изменения: %s\n\n", ball);

        ball.move(11.3, -33.234);
        System.out.printf("Данные мяча после передвижения: %s", ball);
    }
}
