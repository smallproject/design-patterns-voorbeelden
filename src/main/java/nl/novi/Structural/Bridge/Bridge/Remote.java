package nl.novi.Structural.Bridge.Bridge;

public class Remote {
    Device device;

    public Remote (Device device){
        this.device = device;
    }

    public void togglePower(){
        if(device.isEnabled()){
            device.disable();
        } else {
            device.enable();
        }
    }

    public void volumeDown(){
        device.setVolume(device.getVolume() - 10);
    }

    public void volumeUp(){
        device.setVolume(device.getVolume() + 10);
    }

    public void channelUp(){
        device.setChannel(device.getChannel() + 1);
    }

    public void channelDown(){
        device.setChannel(device.getChannel() - 1);
    }



}
