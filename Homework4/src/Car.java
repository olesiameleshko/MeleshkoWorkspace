import java.util.ArrayList;
import java.util.List;

//Task 3
public class Car {
    private String model;
    private String color;
    private int maxSpeed;

    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;//has-a
        this.wheels.add(new Wheel());
        this.wheels.add(new Wheel());
        this.wheels.add(new Wheel());
        this.wheels.add(new Wheel());
    }

    public List<Wheel> wheels = new ArrayList<>();//uses-a

    public void start () {

        this.engine.start();
    }

    public void stop () {

        this.engine.stop();
    }

    public void setMaxSpeed(int maxSpeed) {

        this.maxSpeed = maxSpeed;
    }

    public void setModel(String model) {

        this.model = model;
    }

    public void setColor(String color) {

        this.color = color;
    }

    public void carInfo() {
        System.out.println("Car Model: " + model + ". Car Color: " + color
                + ". Max Speed: " + maxSpeed + ".");
    }
}

