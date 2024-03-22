package nl.novi.Structural.Decorator.notify.code;

public class FacebookNotify extends NotifyWrapper{
    public FacebookNotify(Notify notify) {
        super(notify);
    }

    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("Verzend via facebook: " + message);
    }
}
