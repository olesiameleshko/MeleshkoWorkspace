package Task4;

public class Main {
    public static void main(String[] args) {
        RemoteController remoteController = new RemoteController();
        remoteController.connectDevice(new TV());
        remoteController.upVolume();
        remoteController.upVolume();
        remoteController.downVolume();
        remoteController.mute();
        remoteController.upVolume();
        remoteController.upVolume();
        remoteController.mute();
        System.out.println("The current channel is " + remoteController.currentChannel());
        remoteController.setChannel(19);
        System.out.println("The current channel is " + remoteController.currentChannel());
        remoteController.switchChannel();
        System.out.println("The current channel is " + remoteController.currentChannel());
        remoteController.checkIfDeviceConnected();
        remoteController.disconnectDevice();
        remoteController.checkIfDeviceConnected();
        remoteController.connectDevice(new TV());
        remoteController.checkIfDeviceConnected();
        System.out.println("The current channel is " + remoteController.currentChannel());
        remoteController.powerOff();
        remoteController.checkIfDeviceConnected();
        remoteController.powerOn();
    }
}
