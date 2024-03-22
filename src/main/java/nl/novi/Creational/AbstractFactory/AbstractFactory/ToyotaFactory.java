package nl.novi.Creational.AbstractFactory.AbstractFactory;

import nl.novi.Creational.AbstractFactory.AbstractFactory.product.Engine;
import nl.novi.Creational.AbstractFactory.AbstractFactory.product.ToyotaEngine;
import nl.novi.Creational.AbstractFactory.AbstractFactory.product.ToyotaWheels;
import nl.novi.Creational.AbstractFactory.AbstractFactory.product.Wheels;

// Concrete fabriek voor het maken van onderdelen voor Toyota-auto's
public class ToyotaFactory implements CarFactory {
    @Override
    public Engine createEngine() {
        return new ToyotaEngine();
    }

    @Override
    public Wheels createWheels() {
        return new ToyotaWheels();
    }
}
