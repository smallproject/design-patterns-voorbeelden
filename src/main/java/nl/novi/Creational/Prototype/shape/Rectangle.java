package nl.novi.Creational.Prototype.shape;

import java.util.Objects;

public class Rectangle extends Shape{
    public int width;
    public int height;

    public Rectangle(){}

    public Rectangle (Shape shape, int width, int height){
        super(shape);
        this.width = width;
        this.height = height;
    }

    public Rectangle(Rectangle rectangle){
        super(rectangle);
        this.width = rectangle.width;
        this.height = rectangle.height;
    }

    @Override
    public Rectangle clone(){
        return new Rectangle(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Rectangle rectangle = (Rectangle) o;
        return width == rectangle.width && height == rectangle.height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), width, height);
    }
}
