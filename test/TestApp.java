import shape.*;

public class TestApp {
    public static void main(String[] args) {
        System.out.println("=== Testing MovablePoint ===");
        Movable m1 = new MovablePoint(50, 60, 10, 15); // upcast
        System.out.println(m1);
        m1.moveLeft();
        m1.moveDown();
        System.out.println(m1);

        System.out.println("\n=== Testing MovableCircle ===");
        MovableCircle m2 = new MovableCircle(1, 2, 3, 4, 20);
        System.out.println(m2);
        m2.moveRight();
        m2.moveUp();
        System.out.println(m2);
        System.out.printf("Area: %.3f, Perimeter: %.3f%n", m2.area(), m2.perimeter());

        System.out.println("\n=== Testing Polymorphism ===");
        Shape s1 = new MovableCircle(0, 0, 5, 5, 20); // upcast to Shape
        System.out.println(s1);
        s1.moveRight();
        s1.moveUp();
        System.out.println(s1);
        System.out.printf("Area: %.3f, Perimeter: %.3f%n", s1.area(), s1.perimeter());
    }
}