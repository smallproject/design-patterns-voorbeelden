package nl.novi.Creational.AbstractFactory.AbstractFactory;

import nl.novi.Creational.AbstractFactory.AbstractFactory.product.Engine;
import nl.novi.Creational.AbstractFactory.AbstractFactory.product.Wheels;

// Abstracte interface voor het maken van verschillende onderdelen van een auto
public interface CarFactory {
    Engine createEngine();

    Wheels createWheels();
}
