package nl.novi.Structural.Decorator.notify;


import nl.novi.Structural.Decorator.notify.code.DiscordNotify;
import nl.novi.Structural.Decorator.notify.code.FacebookNotify;
import nl.novi.Structural.Decorator.notify.code.Notify;
import nl.novi.Structural.Decorator.notify.code.WhatsappNotify;

public class NotificatieApplicatieMain {
    public static void main(String[] args) {
        String message = "We hebben belangrijk nieuws voor je!";

        Notify notify = new WhatsappNotify(new DiscordNotify(new FacebookNotify(new Notify())));

        notify.send(message);
    }
}
