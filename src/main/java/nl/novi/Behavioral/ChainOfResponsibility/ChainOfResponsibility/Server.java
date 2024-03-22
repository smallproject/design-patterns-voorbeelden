package nl.novi.Behavioral.ChainOfResponsibility.ChainOfResponsibility;


import java.util.HashMap;
import java.util.Map;

/**
 * Server class.
 */
public class Server {
    private Map<String, String> users = new HashMap<>();
    private Handler handler;

    /**
     * De Client geeft de Handlet chain door aan de server.
     * Dit zorgt voor meer flexibiliteit en maakt dat de server klasse makkelijker getest kan worden.
     */
    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    /**
     * De server krijgt het email en password van de Client en stuurt deze door naar de handler chain.
     */
    public boolean logIn(String email, String password) {
        if (handler.check(email, password)) {
            System.out.println("Authorization have been successful!");

            // Hier staat code voor geauthoriseerde gebruikers.

            return true;
        }
        return false;
    }

    public void register(String email, String password) {
        users.put(email, password);
    }

    public boolean hasEmail(String email) {
        return users.containsKey(email);
    }

    public boolean isValidPassword(String email, String password) {
        return users.get(email).equals(password);
    }
}