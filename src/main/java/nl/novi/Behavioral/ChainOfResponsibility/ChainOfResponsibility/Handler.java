package nl.novi.Behavioral.ChainOfResponsibility.ChainOfResponsibility;


/**
 * Basis Handler klasse
 */
public abstract class Handler {
    private Handler next;

    /**
     * Bouwt een "chain" van Handler classes
     */
    public static Handler link(Handler first, Handler... chain) {
        Handler head = first;
        for (Handler nextInChain: chain) {
            head.next = nextInChain;
            head = nextInChain;
        }
        return first;
    }

    /**
     * Elke subklasse zal deze methode implementeren met eigen logica.
     */
    public abstract boolean check(String email, String password);

    /**
     * Voert de check van het volgende Handler object in de chain uit.
     * Het beeindigt de link als er geen volgend HAndler object is.
     */
    protected boolean checkNext(String email, String password) {
        if (next == null) {
            return true;
        }
        return next.check(email, password);
    }
}