package nl.novi.Creational.Builder.simpleBuilder;

public class CarBuilder {
    private String brand;
    private String model;
    private String vin;
    private String color;
    private int numberOfDoors;

    public CarBuilder setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public CarBuilder setModel(String model) {
        this.model = model;
        return this;
    }

    public CarBuilder setVin(String vin) {
        this.vin = vin;
        return this;
    }

    public CarBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    public CarBuilder setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
        return this;
    }

    public Car createCar() {
        return new Car(brand, model, vin, color, numberOfDoors);
    }
}