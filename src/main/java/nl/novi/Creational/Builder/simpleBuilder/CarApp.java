package nl.novi.Creational.Builder.simpleBuilder;

public class CarApp {

        public static void main(String[] args) {
            var car = new Car("Ford","Focus", "V12345678", "Red" , 5);

            var buildCar = new CarBuilder()
                    .setBrand("Ford")
                    .setModel("Focus")
                    .setColor("red")
                    .setNumberOfDoors(6)
                    .setVin("V23456789")
                    .createCar();

            System.out.println("Normal car vin:  " + car.getVin());
            System.out.println("Builder car vin: " + buildCar.getVin());
        }

}
