package nl.novi.Creational.Builder.complexBuilder.builders;

import nl.novi.Creational.Builder.complexBuilder.cars.CarType;
import nl.novi.Creational.Builder.complexBuilder.cars.Manual;
import nl.novi.Creational.Builder.complexBuilder.components.Engine;
import nl.novi.Creational.Builder.complexBuilder.components.GPSNavigator;
import nl.novi.Creational.Builder.complexBuilder.components.Transmission;
import nl.novi.Creational.Builder.complexBuilder.components.TripComputer;

public class CarManualBuilder implements Builder{
    private CarType type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    @Override
    public void setCarType(CarType type) {
        this.type = type;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    public Manual getResult() {
        return new Manual(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}
