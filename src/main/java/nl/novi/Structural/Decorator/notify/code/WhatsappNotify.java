package nl.novi.Structural.Decorator.notify.code;

public class WhatsappNotify extends NotifyWrapper{
    public WhatsappNotify(Notify notify) {
        super(notify);
    }

    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("Verzend via whatsapp: " + message);
    }
}
