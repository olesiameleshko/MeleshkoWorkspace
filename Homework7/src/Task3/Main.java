package Task3;

public class Main {
    public static void main(String[] args) {
        MyDevice myDevice = new MyDevice();
        myDevice.on();
        myDevice.changeVolume(100);
        myDevice.changeVolume(0);
        myDevice.off();
    }
}
