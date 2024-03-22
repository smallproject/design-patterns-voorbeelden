package nl.novi.Creational.AbstractFactory;

import nl.novi.Creational.AbstractFactory.AbstractFactory.BMWFactory;
import nl.novi.Creational.AbstractFactory.AbstractFactory.CarFactory;
import nl.novi.Creational.AbstractFactory.AbstractFactory.ToyotaFactory;
import nl.novi.Creational.AbstractFactory.AbstractFactory.product.Car;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;


public class AbstractFactoryTest {


    @Test
    public void toyotaTest(){
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        PrintStream originalPrintStream = System.out;
        System.setOut(printStream);

        CarFactory toyotaFactory = new ToyotaFactory();
        Car toyotaCar = new Car(toyotaFactory);
        toyotaCar.displayInfo();

        assertEquals(outputStream.toString(), "Engine: Toyota Engine" + System.lineSeparator() + "Wheels: Toyota Wheels" + System.lineSeparator());

        System.setOut(originalPrintStream);
    }

    @Test
    public void BMWTest(){
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        PrintStream originalPrintStream = System.out;
        System.setOut(printStream);

        CarFactory bmwFactory = new BMWFactory();
        Car bmwCar = new Car(bmwFactory);
        bmwCar.displayInfo();

        assertEquals(outputStream.toString(), "Engine: BMW Engine" + System.lineSeparator() + "Wheels: BMW Wheels" + System.lineSeparator());

        System.setOut(originalPrintStream);
    }

}
