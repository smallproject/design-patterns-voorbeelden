package nl.novi.Creational.FactoryMethod;

import nl.novi.Creational.FactoryMethod.transport.Ship;
import nl.novi.Creational.FactoryMethod.transport.Truck;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactoryMethodTest {
    Ship ship = new Ship();
    Truck truck = new Truck();

    @Test
    void truckTest() {
        assertEquals(truck.shipGoods(), Main.doOrder(Main.TransportEnum.TRUCK));
    }

    @Test
    void shipTest(){
        assertEquals(ship.shipGoods(), Main.doOrder(Main.TransportEnum.SHIP));
    }
}