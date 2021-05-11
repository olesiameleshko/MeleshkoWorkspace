package Task5;

abstract public class Figure {
    protected String name = "";
    protected final double pi = 3.1415;

    abstract double calculateArea();

    String getName() {
        return this.name + ": ";
    }
}
