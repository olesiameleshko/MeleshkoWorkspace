//Task 7
import java.util.Random;

public class InitializationBlock {
    public static int nextId = 0;
    public int id = 0;
    public String name;
    public double salary;

    {
        System.out.println("Inside initialization block");
        id = nextId;
        nextId++;
    }

    static {
        var generator = new Random();
        nextId = generator.nextInt(10000);
    }

    public InitializationBlock (String name, double salary) {
        System.out.println("Inside Employee(String, double) constructor");
        this.name = name;
        this.salary = salary;
    }

    public InitializationBlock () {
        System.out.println("Inside empty constructor");
        this.name = "";
        this.salary = 0.0;
    }

    public int getId() {

        return this.id;
    }
}
