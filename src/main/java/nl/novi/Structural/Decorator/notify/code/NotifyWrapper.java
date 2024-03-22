package nl.novi.Structural.Decorator.notify.code;

public class NotifyWrapper extends Notify{

    Notify notify;

    public NotifyWrapper(Notify notify){
        this.notify = notify;
    }

    @Override
    public void send(String message){
        notify.send(message);
    }
}
