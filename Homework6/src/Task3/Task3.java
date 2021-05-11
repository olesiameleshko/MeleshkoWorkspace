package Task3;

public class Task3 {
    public static void main(String[] args) {
        Model tesla = new Model();
        System.out.println(tesla.getName());
        System.out.println(tesla.getSize());
        tesla.steer(7);
        System.out.println(tesla.getDoors());
        tesla.stop();
        tesla.move(20, 50);
        System.out.println(tesla.getCurrentVelocity());
        System.out.println(tesla.getCurrentDirection());
        tesla.turnMusicOn();
        tesla.turnMusicOff();
        tesla.turnAutopilotOn();
        tesla.turnAutopilotOff();
        System.out.println(tesla.getEngine());
        System.out.println(tesla.getWheels());
        tesla.gearChange(' ');
        tesla.gearChange('R');
    }
}
