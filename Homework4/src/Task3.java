public class Task3 {
    public static void main(String[] args) {
        Engine engine = new Engine();
        Car car = new Car(engine);
        car.setModel("Tesla");
        car.setColor("Black");
        car.setMaxSpeed(335);
        car.carInfo();
        car.start();
        car.stop();
    }
}
