package nl.novi.Creational.Prototype.java;

public class JavaBasePrototype implements Cloneable{
    public int number;
    public String name;
    public boolean value;

    public JavaBasePrototype(int number, String name, boolean value) {
        this.number = number;
        this.name = name;
        this.value = value;
    }


    @Override
    public JavaBasePrototype clone() {
        try {
            JavaBasePrototype clone = (JavaBasePrototype) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
