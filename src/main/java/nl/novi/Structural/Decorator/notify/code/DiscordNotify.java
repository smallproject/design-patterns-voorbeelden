package nl.novi.Structural.Decorator.notify.code;

public class DiscordNotify extends NotifyWrapper{
    public DiscordNotify(Notify notify) {
        super(notify);
    }

    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("Verzend via discord: " + message);
    }
}
