package Task4;

public class TV extends TVDevice {
    private int volumeLevel = 0;
    private int channelNumber = 10;

    public TV(){
        this.modelName = "Sony";
    }

    public void powerOn() {
        this.isOn=true;
        System.out.println("The device is powered on");
    }

    public void powerOff() {
        this.isOn=false;
        System.out.println("The device is powered off");
    }

    public void setChannel(int channel) {
    this.channelNumber=channel;
        System.out.println("The channel is switched to " + channelNumber);
    }

    public int currentChannel() {

        return channelNumber;
    }

    public void upVolume() {
        this.volumeLevel += 1;
        System.out.println("Current volume is " + volumeLevel);
    }

    public void downVolume() {
        this.volumeLevel -= 1;
        System.out.println("Current volume is " + volumeLevel);
    }

    public void mute() {
        this.volumeLevel=0;
        System.out.println("The volume is muted");
    }

    public void switchChannel() {
        this.channelNumber++;
        System.out.println("The channel is changed to " + channelNumber);
    }
}
