package nl.novi.Creational.SingletonPattern;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Main {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        Singleton s3 = Singleton.getInstance();

        assertEquals(s1.counter, s2.counter);
        assertEquals(s1.counter, s3.counter);
        assertEquals(s2.counter, s3.counter);
    }

}
