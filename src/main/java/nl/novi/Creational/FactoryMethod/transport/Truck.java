package nl.novi.Creational.FactoryMethod.transport;

public class Truck extends Transport {
    @Override
    public String shipGoods() {
        return "Delivering via road";
    }
}
