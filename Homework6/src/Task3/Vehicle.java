package Task3;

public class Vehicle {
    private String name;
    private String size;
    private int currentVelocity;
    protected int currentDirection;

    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;
        this.currentVelocity = 0;
        this.currentDirection = 0;
    }

    public void move(int velocity, int direction){
        currentVelocity = velocity;
        currentDirection = direction;
        System.out.println("Vehicle.move(): Moving at " + currentVelocity + " in direction " + currentDirection);

    }
    public void stop(){
        this.currentVelocity = 0;
        System.out.println("The vehicle is stopped");
    }

    public String getName() {

        return name;
    }

    public String getSize() {

        return size;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {

        return currentDirection;

    }
}

