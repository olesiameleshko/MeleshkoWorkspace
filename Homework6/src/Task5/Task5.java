package Task5;

public class Task5 {
    public static void main(String[] args) {
        Figure rectangle = new Rectangle(3.0,6.0);
        Figure circle = new Circle(3.0);
        Figure triangle = new Triangle(3.5, 1.8, 2.2);
        System.out.println(rectangle.getName() + rectangle.calculateArea());
        System.out.println(circle.getName() + circle.calculateArea());
        System.out.println(triangle.getName() + triangle.calculateArea());
    }
}
