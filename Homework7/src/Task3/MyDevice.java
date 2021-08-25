package Task3;

public class MyDevice implements Volume, State {
    private boolean isOn = false;
    private double value = 0;

    public MyDevice() {
    }
    public void on() {
        System.out.println("Device is turned on");
        this.isOn = true;
        System.out.println("The state is " + isOn);
    }

    public void off() {
        System.out.println("Device is turned off");
        this.isOn = false;
        System.out.println("The state is " + isOn);
    }

    public void changeVolume(double value) {
        if (this.value >= 1){
        System.out.println("The volume is changing to: " + value);}
            else {
        System.out.println("The volume is " + value);}
    }
}
