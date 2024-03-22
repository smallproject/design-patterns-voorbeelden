package nl.novi.Creational.AbstractFactory.AbstractFactory;

import nl.novi.Creational.AbstractFactory.AbstractFactory.product.BMWEngine;
import nl.novi.Creational.AbstractFactory.AbstractFactory.product.BMWWheels;
import nl.novi.Creational.AbstractFactory.AbstractFactory.product.Engine;
import nl.novi.Creational.AbstractFactory.AbstractFactory.product.Wheels;

// Concrete fabriek voor het maken van onderdelen voor BMW-auto's
public class BMWFactory implements CarFactory {
    @Override
    public Engine createEngine() {
        return new BMWEngine();
    }

    @Override
    public Wheels createWheels() {
        return new BMWWheels();
    }
}
