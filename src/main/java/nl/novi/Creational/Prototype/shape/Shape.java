package nl.novi.Creational.Prototype.shape;

import java.util.Objects;

public abstract class Shape {
   public int x;
   public int y;
   public String color;

    public Shape() {
    }

    public Shape(Shape shape) {
        this.x = shape.x;
        this.y = shape.y;
        this.color = shape.color;
    }

    public Shape(int x, int y, String color){
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public abstract Shape clone();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shape shape = (Shape) o;
        return x == shape.x && y == shape.y && Objects.equals(color, shape.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, color);
    }
}
