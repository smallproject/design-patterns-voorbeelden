package nl.novi.Behavioral.ChainOfResponsibility.ChainOfResponsibility;

/**
 * ConcreteHandler. Checkt de rol van de gebruiker
 */
public class RoleCheckHandler extends Handler {
    public boolean check(String email, String password) {
        if (email.equals("admin@example.com")) {
            System.out.println("Hello, admin!");
            return true;
        }
        System.out.println("Hello, user!");
        return checkNext(email, password);
    }
}
