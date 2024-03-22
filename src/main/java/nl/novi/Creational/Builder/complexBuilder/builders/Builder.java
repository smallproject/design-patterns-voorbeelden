package nl.novi.Creational.Builder.complexBuilder.builders;

import nl.novi.Creational.Builder.complexBuilder.cars.CarType;
import nl.novi.Creational.Builder.complexBuilder.components.Engine;
import nl.novi.Creational.Builder.complexBuilder.components.GPSNavigator;
import nl.novi.Creational.Builder.complexBuilder.components.Transmission;
import nl.novi.Creational.Builder.complexBuilder.components.TripComputer;

public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
