package nl.novi.Creational.Builder.complexBuilder;

import nl.novi.Creational.Builder.complexBuilder.builders.CarBuilder;
import nl.novi.Creational.Builder.complexBuilder.builders.CarManualBuilder;
import nl.novi.Creational.Builder.complexBuilder.cars.Car;
import nl.novi.Creational.Builder.complexBuilder.cars.Manual;
import nl.novi.Creational.Builder.complexBuilder.director.Director;

public class Client {
        public static void main(String[] args) {
            Director director = new Director();

            // Director krijgt het concrete builder onject van de client
            // Dat is omdat de client beter weet welke builder gebruikt moet worden om
            // een specifiek product te maken.
            CarBuilder builder = new CarBuilder();
            director.constructSportsCar(builder);

            // Het uiteindelijke product word meestal uit de builder gehaald,
            // omdat de director zich niet bewust is van en niet afhankelijk is van
            // de concrete builder en het product.
            Car car = builder.getResult();
            System.out.println("Car built:\n" + car.getCarType());


            CarManualBuilder manualBuilder = new CarManualBuilder();

            // De director kan verschillende build recepten kennen, zoals hier ook de handleiding van een auto.
            director.constructSportsCar(manualBuilder);
            Manual carManual = manualBuilder.getResult();
            System.out.println("\nCar manual built:\n" + carManual.print());
        }

}
