package Task5;

public class Triangle extends Figure{
    double a, b, c;

    public Triangle (double a, double b, double c) {
        name = "Triangle";
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    double calculateArea() {
        double p = (a+b+c)/2;
        double s = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return s;
    }
}
