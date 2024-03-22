package nl.novi.Creational.Prototype;

import nl.novi.Creational.Prototype.shape.Circle;
import nl.novi.Creational.Prototype.shape.Rectangle;
import nl.novi.Creational.Prototype.shape.Shape;
import nl.novi.Creational.Prototype.java.JavaBasePrototype;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Main {

    public static void main(String[] args) {

        JavaBasePrototype jbp = new JavaBasePrototype(1, "x", true);
        JavaBasePrototype jbp2 = jbp.clone();
        assertEquals(jbp2.name, jbp.name);
        assertEquals(jbp2.number, jbp.number);
        assertEquals(jbp2.value, jbp.value);

        doShapes();
    }

    public static void doShapes() {
        List<Shape> shapes = new ArrayList<>();
        List<Shape> shapesCopy = new ArrayList<>();

        Circle circle = new Circle();
        circle.x = 10;
        circle.y = 20;
        circle.radius = 15;
        circle.color = "red";
        shapes.add(circle);

        Circle anotherCircle = (Circle) circle.clone();
        shapes.add(anotherCircle);

        Rectangle rectangle = new Rectangle();
        rectangle.width = 10;
        rectangle.height = 20;
        rectangle.color = "blue";
        shapes.add(rectangle);

        cloneAndCompare(shapes, shapesCopy);
    }

    private static void cloneAndCompare(List<Shape> shapes, List<Shape> shapesCopy) {
        for (Shape shape : shapes) {
            shapesCopy.add(shape.clone());
        }

        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) != shapesCopy.get(i)) {
                System.out.println(i + ": Shapes are different objects (yay!)");
                if (shapes.get(i).equals(shapesCopy.get(i))) {
                    System.out.println(i + ": And they are identical (yay!)");
                } else {
                    System.out.println(i + ": But they are not identical (booo!)");
                }
            } else {
                System.out.println(i + ": Shape objects are the same (booo!)");
            }
        }
    }

}
