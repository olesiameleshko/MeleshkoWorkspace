package Task5;

public class Circle extends Figure{

    double r;

    public Circle(double r) {
        name = "Circle";
        this.r = r;
    }

    @Override
    double calculateArea() {

        return pi*r*r;
    }
}
