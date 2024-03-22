package nl.novi.Behavioral.ChainOfResponsibility.ChainOfResponsibility;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Main class. Hier komt alles samen
 */
public class Main {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Server server;

    private static void init() {
        server = new Server();
        server.register("admin@example.com", "admin_pass");
        server.register("user@example.com", "user_pass");

        // Alle checks zijn gelinkt. De client kan verschillende handler chains bouwen met dezelfde componenten.
        Handler handler = Handler.link(
                new LoginLimitHandler(2),
                new UserExistsHandler(server),
                new RoleCheckHandler()
        );

        // De Server krijgt de handler chain van de client
        server.setHandler(handler);
    }

    public static void main(String[] args) throws IOException {
        init();

        boolean success;
        do {
            System.out.print("Enter email: ");
            String email = reader.readLine();
            System.out.print("Input password: ");
            String password = reader.readLine();
            success = server.logIn(email, password);
        } while (!success);
    }
}
