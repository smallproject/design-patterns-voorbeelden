package nl.novi.Creational.FactoryMethod.transport;

public class Ship extends Transport{
    @Override
    public String shipGoods() {
        return "Delivering via sea";
    }
}
