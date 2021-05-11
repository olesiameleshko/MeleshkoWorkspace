package Task3;

public class Car extends Vehicle {
    private int doors;
    protected String engine;
    private int wheels;

    public Car(String name, String size, int doors, String engine, int wheels) {
        super(name, size);
        this.doors = doors;
        this.engine = engine;
        this.wheels = wheels;
    }

    public void steer(int direction) {
        this.currentDirection += direction;
        System.out.println("Vehicle.steer(): Steering at " + currentDirection + " degrees.");
    }

    public int getDoors() {

        return doors;
    }

    public String getEngine() {
        return engine;
    }

    public int getWheels() {
        return wheels;
    }

    public void gearChange(char gear) {
        switch (gear) {
            case 'R':
            case 'r':
                System.out.println("The Car is using Reverse mode.");
                break;
            case 'N':
            case 'n':
                System.out.println("The Car is using Neutral mode.");
                break;
            case 'D':
            case 'd':
                System.out.println("This car is using Drive mode.");
                break;
            case 'A':
            case 'a':
                System.out.println("The Car is using Autopilot mode.");
                break;
            case 'P':
            case 'p':
                System.out.println("The Car is using Parking mode.");
                break;

            default:
                System.out.println("No information about gear.");
                break;
        }
    }
}