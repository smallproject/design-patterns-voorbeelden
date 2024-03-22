package nl.novi.Creational.FactoryMethod;

import nl.novi.Creational.FactoryMethod.transport.Transport;
import nl.novi.Creational.FactoryMethod.transportation.ShipTransportation;
import nl.novi.Creational.FactoryMethod.transportation.Transportation;
import nl.novi.Creational.FactoryMethod.transportation.TruckTransportation;

import java.sql.SQLType;
import java.util.Scanner;

public class Main {
    enum TransportEnum{
        TRUCK,
        SHIP
    }
    public static TransportEnum getOrder(){
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Do you want a truck or a ship transport?");
            String input = scanner.nextLine();
            if(input.equals("truck")){
                return TransportEnum.TRUCK;
            } else if (input.equals("ship")){
                return TransportEnum.SHIP;
            } else {
                System.out.println("This input is not valid.");
            }
        }
    }
    public static String doOrder(TransportEnum transportEnum){
        Transportation transportation;
        if(transportEnum.equals(TransportEnum.SHIP)){
            transportation = new ShipTransportation();
        } else {
            transportation = new TruckTransportation();
        }

        return transportation.makeDelivery();
    }

    public static void main(String[] args) {
        TransportEnum transportEnum = getOrder();
        System.out.println(doOrder(transportEnum));

    }
}
