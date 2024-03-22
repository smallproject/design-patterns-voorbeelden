package nl.novi.Structural.Bridge.Bridge;

public class Radio implements Device{
    private boolean enabled = false;
    private int volume = 0;
    private int channel = 1;
    @Override
    public boolean isEnabled() {
        return enabled;
    }

    @Override
    public void disable() {
        enabled = false;
    }

    @Override
    public void enable() {
        enabled = true;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public int getChannel() {
        return channel;
    }

    @Override
    public void setChannel(int channel) {
        if(channel <= 100 && channel > 0) {
            this.channel = channel;
        } else {
            this.channel = 1;
        }
    }

    public void printVolume(){
        System.out.println("Radio volume: " + getVolume());
    }
}
