package nl.novi.Creational.FactoryMethod.transportation;

import nl.novi.Creational.FactoryMethod.transport.Ship;
import nl.novi.Creational.FactoryMethod.transport.Transport;

public class ShipTransportation extends Transportation{
    @Override
    public Transport createTransport() {
        return new Ship();
    }
}
