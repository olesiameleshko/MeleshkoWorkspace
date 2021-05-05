//Task5
public class Constructor {
    double height;
    double weight;
    double depth;
    String name;
    String format;
    String size;
    int age;
    long salary;
    boolean started;
    boolean stopped;

    public Constructor () {
    }

    public Constructor (double height, double weight, double depth) {
        this.height = height;
        this.weight = weight;
        this.depth = depth;
    }

    public Constructor (String name, String format, String size) {
        this.name = name;
        this.format = format;
        this.size = size;
    }

    public Constructor (int age, long salary) {
        this.age = age;
        this.salary = salary;
    }

    public Constructor (boolean started, boolean stopped) {
        this.started = started;
        this.stopped = stopped;
    }
    public double getArea () {

        return weight * height * depth;
    }
    public String toString () {
        return this.name + this.format + this.size;
    }
    public int getAge() {

        return this.age;
    }
    public long getSalary () {

        return this.salary;
    }
    public boolean isStarted () {

        return this.started;
    }
    public boolean isStopped () {

        return this.stopped;
    }
}

