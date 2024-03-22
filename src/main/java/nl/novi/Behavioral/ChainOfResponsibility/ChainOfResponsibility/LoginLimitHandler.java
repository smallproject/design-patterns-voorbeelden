package nl.novi.Behavioral.ChainOfResponsibility.ChainOfResponsibility;

/**
 * Implementatie van Handler. Deze implementatie checkt of er niet te veel login pogingen zijn gedaan.
 */
public class LoginLimitHandler extends Handler {
    private int requestPerMinute;
    private int request;
    private long currentTime;

    public LoginLimitHandler(int requestPerMinute) {
        this.requestPerMinute = requestPerMinute;
        this.currentTime = System.currentTimeMillis();
    }

    /**
     * De checkNext() methode kan aan het begin of aan het eind van de methode worden aangeroepen.
     *
     * Dit geeft je meer flexibiliteit, dan wanneer je alle Handlers in een for-loop uitvoert.
     * Nu kan een concrete handler implementatie de volgorde van de checks beinvloeden door
     * door diens checks na alle andere checks te draaien.
     */
    public boolean check(String email, String password) {
        if (System.currentTimeMillis() > currentTime + 60_000) {
            request = 0;
            currentTime = System.currentTimeMillis();
        }

        request++;

        if (request > requestPerMinute) {
            System.out.println("Request limit exceeded!");
            System.exit(1);
        }
        return checkNext(email, password);
    }
}