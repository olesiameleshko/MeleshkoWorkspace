package Task4;

public class RemoteController {
    private TVDevice tvDevice;

    public RemoteController() {
    }

    public void connectDevice(TVDevice tvDevice){
        this.tvDevice=tvDevice;
        System.out.println("The device is connected");
    }

    public void disconnectDevice(){
        tvDevice=null;
        System.out.println("The device is disconnected");
    }

    public void upVolume(){
        tvDevice.upVolume();
    }

    public void downVolume(){
        tvDevice.downVolume();
    }

    public void mute(){
        tvDevice.mute();
    }

    public int currentChannel(){
        return tvDevice.currentChannel();
    }

    public void setChannel(int channel) {
        tvDevice.setChannel(channel);
    }

    public void switchChannel(){
        tvDevice.switchChannel();
    }

    public void checkIfDeviceConnected(){
        if (tvDevice!=null){
            System.out.println("The device is connected");
        } else {
            System.out.println("The device isn't connected");
        }
    }

    public void powerOn() {
        tvDevice.powerOn();
    }

    public void powerOff() {
        tvDevice.powerOff();
    }
}
