package nl.novi.Behavioral.ChainOfResponsibility.ChainOfResponsibility;


/**
 * ConcreteHandler. Checkt of er een gebruiker bestaat met de gegeven email en password.
 */
public class UserExistsHandler extends Handler {
    private Server server;

    public UserExistsHandler(Server server) {
        this.server = server;
    }

    public boolean check(String email, String password) {
        if (!server.hasEmail(email)) {
            System.out.println("This email is not registered!");
            return false;
        }
        if (!server.isValidPassword(email, password)) {
            System.out.println("Wrong password!");
            return false;
        }
        return checkNext(email, password);
    }
}
