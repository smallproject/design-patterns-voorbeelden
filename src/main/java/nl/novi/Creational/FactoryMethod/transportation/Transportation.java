package nl.novi.Creational.FactoryMethod.transportation;

import nl.novi.Creational.FactoryMethod.transport.Transport;

public abstract class Transportation {

    // Hier kun je ook al een default implementatie maken en dat overschrijven of
    public abstract Transport createTransport();

    public String makeDelivery(){
        Transport transport = createTransport();
        return transport.shipGoods();
    }
}
