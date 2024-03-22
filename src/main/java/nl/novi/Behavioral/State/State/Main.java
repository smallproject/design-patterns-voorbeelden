package nl.novi.Behavioral.State.State;

import nl.novi.Behavioral.State.State.ui.Player;
import nl.novi.Behavioral.State.State.ui.UI;

public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        UI ui = new UI(player);
        ui.init();
    }
}
