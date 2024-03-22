package nl.novi.Structural.Bridge.Bridge;

public interface Device {
    boolean isEnabled();
    void disable();
    void enable();
    int getVolume();
    void setVolume(int volume);
    int getChannel();
    void setChannel(int channel);
}
