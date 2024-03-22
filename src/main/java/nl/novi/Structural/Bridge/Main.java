package nl.novi.Structural.Bridge;

import nl.novi.Structural.Bridge.Bridge.AdvancedRemote;
import nl.novi.Structural.Bridge.Bridge.Radio;
import nl.novi.Structural.Bridge.Bridge.Remote;
import nl.novi.Structural.Bridge.Bridge.Tv;

public class Main {
    public static void main(String[] args) {
        Tv tv = new Tv();
        Remote remote = new Remote(tv);
        remote.togglePower();

        Radio radio = new Radio();
        AdvancedRemote advancedRemote = new AdvancedRemote(radio);
        advancedRemote.volumeUp();
        advancedRemote.volumeUp();

        tv.printVolume();
        radio.printVolume();

        System.out.println("--------------");

        advancedRemote.mute();
        remote.volumeUp();

        tv.printVolume();
        radio.printVolume();
    }
}
