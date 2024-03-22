package nl.novi.Creational.AbstractFactory.AbstractFactory.product;

import nl.novi.Creational.AbstractFactory.AbstractFactory.CarFactory;

// Klasse die auto's maakt met behulp van de Abstract Factory
public class Car {
    private Engine engine;
    private Wheels wheels;

    public Car(CarFactory factory) {
        engine = factory.createEngine();
        wheels = factory.createWheels();
    }

    public void displayInfo() {
        System.out.println("Engine: " + engine.getDescription());
        System.out.println("Wheels: " + wheels.getDescription());
    }
}
