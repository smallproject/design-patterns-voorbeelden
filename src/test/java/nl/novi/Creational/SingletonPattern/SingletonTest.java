package nl.novi.Creational.SingletonPattern;

import nl.novi.Creational.SingletonPattern.Singleton;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingletonTest {

    @Test
    public void singletonTest(){
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        Singleton s3 = Singleton.getInstance();

        assertEquals(s1.counter, s2.counter);
        assertEquals(s1.counter, s3.counter);
        assertEquals(s2.counter, s3.counter);
    }

}