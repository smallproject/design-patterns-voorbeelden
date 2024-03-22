package nl.novi.Creational.AbstractFactory.AbstractFactory;

import nl.novi.Creational.AbstractFactory.AbstractFactory.product.Car;

public class Main {
    public static void main(String[] args) {
        // Gebruik Toyota-fabriek om een Toyota-auto te maken
        CarFactory toyotaFactory = new ToyotaFactory();
        Car toyotaCar = new Car(toyotaFactory);
        toyotaCar.displayInfo();

        System.out.println();

        // Gebruik BMW-fabriek om een BMW-auto te maken
        CarFactory bmwFactory = new BMWFactory();
        Car bmwCar = new Car(bmwFactory);
        bmwCar.displayInfo();
    }
}
