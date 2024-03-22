package nl.novi.Creational.FactoryMethod.transportation;

import nl.novi.Creational.FactoryMethod.transport.Transport;
import nl.novi.Creational.FactoryMethod.transport.Truck;

public class TruckTransportation extends Transportation{
    @Override
    public Transport createTransport() {
        return new Truck();
    }
}
