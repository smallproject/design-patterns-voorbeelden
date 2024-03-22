package nl.novi.Creational.AbstractFactory.AbstractFactory.product;


// Concrete implementaties van auto-onderdelen voor Toyota
public class ToyotaEngine implements Engine {
    @Override
    public String getDescription() {
        return "Toyota Engine";
    }
}
