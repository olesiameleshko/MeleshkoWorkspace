package Task5;

public class Rectangle extends Figure{
    double a, b;

    public Rectangle (double a, double b) {
        name = "Rectangle";
        this.a = a;
        this.b = b;
    }

    @Override
    double calculateArea() {
        return a * b;
    }
}
