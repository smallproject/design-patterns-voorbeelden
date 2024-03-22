package nl.novi.Creational.AbstractFactory.AbstractFactory.product;


// Concrete implementaties van auto-onderdelen voor BMW
public class BMWEngine implements Engine {
    @Override
    public String getDescription() {
        return "BMW Engine";
    }
}
